package ArrayChallenge1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter Action: (6 - Show Actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
//    Methods:
    private static void startPhone(){
        System.out.println("Starting Phone...");
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - Shutdown\n" +
                "1 - Print Contacts\n" +
                "2 - Add New Contact\n" +
                "3 - Update Existing Contact\n" +
                "4 - Remove an Existing Contact\n" +
                "5 - Find a Contact\n" +
                "6 - Available Actions");
        System.out.println("Choose your action: ");
    }
//    Important Methods:
    private static void addNewContact(){
        System.out.println("Adding New Contact\n");
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phone);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println(name + " Successfully Added.");
        } else {
            System.out.println("Already on list.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter contact's name to be Modified: ");
        String name = scanner.nextLine();
        Contact existingContactRecord= mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new Contact's Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Phone Number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

       if(mobilePhone.updateContact(existingContactRecord, newContact)) {
           System.out.println("Updated Successfully.");
       } else {
           System.out.println("Error Updating.");
       }
    }
    private static void removeContact(){
        System.out.println("Enter contact's name to be Removed: ");
        String name = scanner.nextLine();
        Contact existingContactRecord= mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully Deleted.");
        } else {
            System.out.println("Error Deleting Contact.");
        }
    }
    private static void queryContact(){
        System.out.println("Find Contact by Name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord= mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Found:\n");
        System.out.println("Name: " + existingContactRecord.getName() + " || Phone: " + existingContactRecord.getPhoneNumber()+"\n");
    }
}

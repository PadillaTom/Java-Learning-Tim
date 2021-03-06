package ArrayChallenge1;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already on file.");
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println(oldContact.getName() + " -  Not Found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced for: " + newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition <0){
            System.out.println(contact.getName() + " Not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

//    Find Methods: Int and String.
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
            }
    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }


//    Methods for MAIN:
    public void printContacts(){
        System.out.println("Contact List: ");
        for (int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1)+"-\tName: "+ this.myContacts.get(i).getName() + "\n\tPhone: " + this.myContacts.get(i).getPhoneNumber() + "\n");
        }
    }
}

package ListsArrayList;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
//    private static int[] baseData = new int[10];
    private static GroceryList myList = new GroceryList();

    public static void main(String[] args) {
//   *** WITH LISTS AND ARRAY LISTS, THIS WILL BE TAKEN CARE OF IN A FEW LINES. ***
//        System.out.println("Enter 10 Integers: ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 Ints: ");
//        getInput();
//        printArray(baseData);

//  *** Array List ***
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }


//    ** Methods **
//    private static void getInput(){
//        for(int i=0; i< baseData.length; i++){
//            baseData[i]= s.nextInt();
//        }
//    }
//    private static void printArray(int[] array){
//        for(int i=0; i<array.length; i++){
//            System.out.println(array[i] + " ");
//            System.out.println();
//        }
//    }
//    private static void resizeArray(){
//        int[] original = baseData;
//        baseData = new int [12];
//        for (int i=0; i<original.length; i++){
//            baseData[i]= original[i];
//        }
//    }

//    *** Array List ***
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t  0 -  To print Options");
        System.out.println("\t 1 - View List.");
        System.out.println("\t 2 - Add Item.");
        System.out.println("\t 3 - Modify Item.");
        System.out.println("\t 4 - Remove Item.");
        System.out.println("\t 5 - Find Item.");
        System.out.println("\t 6 - Quit App.");
    }

    public static void addItem() {
        System.out.println("Enter the Item to add: ");
        myList.addGroceryItem(s.nextLine());
    }
    public static void modifyItem() {
        System.out.println("Enter index to be modified: ");
        int itemNo = s.nextInt();
        s.nextLine();
        System.out.println("Enter Replacement: ");
        String newItem = s.nextLine();
        myList.modifyItem(itemNo, newItem);
    }
    public static void removeItem() {
        System.out.println("Enter index to remove: ");
        int itemNo = s.nextInt();
        s.nextLine();
        myList.removeItem(itemNo);
    }
    public static void findItem() {
        System.out.println("Enter value to search: ");
        String myItem = s.nextLine();
        if(myList.findItem(myItem) != null){
            System.out.println("Found: " + myItem + "In list.");
        } else {
            System.out.println( myItem + " not found.");
        }
    }


}

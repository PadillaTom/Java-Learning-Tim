package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        ** Linked List **
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "ADDED");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        // Ej 1:
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit); // in order

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

//        Ej 2:
        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> myIterator = linkedList.iterator();
        while(myIterator.hasNext()){
            System.out.println("Now visiting: "+ myIterator.next());
        }
        System.out.println("***");
    }

//    Ej 1: Adding items in Alphabetical order.
    private static boolean addInOrder(LinkedList<String> myList, String newItem){
        ListIterator<String> stringListIterator = myList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newItem); // 0: are equal
            if(comparison == 0){
                System.out.println(newItem + " Already exists.");
                return false;
            } else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newItem);
                return true;
            } else if (comparison<0){
                // Next
            }
        }
        stringListIterator.add(newItem);
        return true;
    }

    // Ej 2:
    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner (System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> myI= cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in list.");
            return;
        } else {
            System.out.println("Now visiting: " + myI.next());
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(myI.hasNext()){
                            myI.next();
                        }
                        goingForward = true;
                    }
                    if(myI.hasNext()){
                        System.out.println("Now visiting: " + myI.next());
                    } else {
                        System.out.println("End of list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(myI.hasPrevious()){
                            myI.previous();
                        }
                        goingForward = false;
                    }
                    if(myI.hasPrevious()){
                        System.out.println("Now visiting: "+ myI.previous());
                    } else {
                        System.out.println("Start of list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Actions:\n");
        System.out.println("0- Quit\n" + "1- Next city\n" + "2- Prev City\n" + "3- Menu\n");
    }
}

package ListsArrayList;

import java.util.ArrayList;
//  SIZE = Length
//  GET = Access a particular element.
//  SET = Modify a value (index, value).
//  REMOVE = removes (index). rearranges the array(Index 3 becomes 2. if 2 was deleted).
//  CONTAINS = True if there is at least one value that matches (searchItem).
//  INDEXOF = Search inside the array to find the index of the parameter (searchItem).

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem (String item) {
        groceryList.add(item);
    }
    public void printList (){
        System.out.println("Your have: " + groceryList.size() + " Items");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + "- " + groceryList.get(i) );
        }
    }
    public void modifyItem (int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Item: " + (pos + 1) + " modified.");
    }
    public void removeItem(int pos){
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);
    }
    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int pos = groceryList.indexOf(searchItem);
        if(pos >= 0) return groceryList.get(pos);
        return null;
    }
}

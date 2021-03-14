package ArrayChallenge1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        int[] myInts = getInts(5);
        int[] sorted = sortInts(myInts);
        printArray(sorted);
    }

//   *** Methods ***
//    Creating and EMPTY array with X capacity(indexes).
    public static int[] getInts(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity+ " Integer values:\r");
        for(int i=0; i<array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
//    Printing INDEX + Array Item.
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element: " + i + " || Array: "+ array[i]  );
        }
    }

//    Copying Array:
//    1) Passing array as argument.
//    2) Taking same LENGTH.
//    3) Adding values to indexes.
    public static int[] sortInts(int[] array){
//        Method 1:
//        int[] sortedArray = new int[array.length];
//        for (int i=0; i< array.length; i++){
//            sortedArray[i] = array[i];
//        }
//        Method 2:
        int[] sortedArray = Arrays.copyOf(array, array.length);

//        **************
//        While LOOP, will loop until TRUE.
        boolean flag = true;
//        To store temporal values
        int temp;
//        WHILE LOOP:
//        Exit: if all numbers are sorted.
//        IF sortedArray[i] < than the Next one --> Store in TEMP
//        Luego guardamos NEXT value en el i utilizado previamente "Swaping them"
//        Terminamos por guardar dicho value en temp tambien.
//        FLAG = True; para continuar el loop. si no quedan values = False y sale.
        while(flag){
            flag=false;
            for(int i=0; i< sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp= sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

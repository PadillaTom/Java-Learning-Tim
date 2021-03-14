package Arrays.Ex1;

import java.util.Scanner;

public class Main {
//    Allowing user Input:
    public static Scanner scanner = new Scanner(System.in);

//    Main:
    public static void main(String[] args) {

        int[] myInts = getIntegers(5);

//        Printing out the Numbers:
        for(int i=0; i<myInts.length; i++){
            System.out.println("Element: " + i +" , value:" + myInts[i]);
        }
//        Average:
        System.out.println("Average is: " + getAverage(myInts));
    }

//Getting integers from Scanner and adding them to Array:
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");

        int[] values = new int[number];
        for(int i=0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

//    METHOD: Get the Average of all values entered.
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double)sum / (double)array.length;
    }

}



public class Main {
    public static void main(String[] args) {
//  *** Arrays *** Store multiple values on the same time.

//  Creating an Array: Specifying type and amount of values.
        int[] myIntArray = new int[10]; // Number of elements, Starts with 0.
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[5]);
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[5] = 12.5;
//        System.out.println(myDoubleArray[5]);

//  Creating Array with the value already set:
//        int[] myValuesArray = {1,2,3,4,5,6};
//        System.out.println(myValuesArray[1]);
//        System.out.println(myValuesArray[5]);

//  Creating an Array with a FOR LOOP:
//    for (int i=0; i<10; i++) {
//        myIntArray[i] = i;
//        System.out.println("Index: " + i + " || Value: " + myIntArray[i]);
//    }
//    for (int i=0; i < myIntArray.length; i++){
//        myIntArray[i] = i*10;
//        System.out.println("Index: " + i + " || Value: " + myIntArray[i]);
//        }

//  Call PRINTARRAY method:
        printArray(myIntArray);
    }

//  Method to print any array:
    public static void printArray(int[] array) {
        for(int i=0; i <array.length; i++){
            System.out.println("Index: " + i + " || Value: " + array[i]);
        }
    }

}

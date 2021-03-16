package Boxing;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

//        BOXING, Using Objects.
        ArrayList<Integer> integerArrayList= new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i));
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
        }
//        UNBOXING, Converting form Object to Primitive
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double dbl= 0.0; dbl<=10.0; dbl+=0.5){
            doubleArrayList.add(Double.valueOf(dbl));
        }
        for(int i =0; i<doubleArrayList.size(); i++){
            double myDbl = doubleArrayList.get(i).doubleValue();
            System.out.println(i+" -> " + myDbl);
        }
    }
}

// Class to create an ArrayList<int>
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


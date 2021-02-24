package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum = " + myMinIntValue);
        System.out.println("Integer Maximum = " + myMaxIntValue);
        System.out.println("Overflowed the MAX Value : " + (myMaxIntValue + 1));
    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	System.out.println("Integer Minimum = " + myMinIntValue);
	System.out.println("Integer Maximum = " + myMaxIntValue);
	System.out.println("Overflowed the MAX Value : " + (myMaxIntValue + 1));

	byte myMinByte = Byte.MIN_VALUE;
	byte myMaxByte = Byte.MAX_VALUE;
	System.out.println(myMinByte);
	System.out.println(myMaxByte);

	short myMinShort = Short.MIN_VALUE;
	short myMaxShort = Short.MAX_VALUE;
	System.out.println(myMinShort);
	System.out.println(myMaxShort);

	long myLong = 100L;
	long myMinLong = Long.MIN_VALUE;
	long myMaxLong = Long.MAX_VALUE;
	System.out.println(myLong);
	System.out.println(myMinLong);
	System.out.println(myMaxLong);

	// Arithmetic and Casting
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByte / 2);
        System.out.println(myNewByteValue);



    }
}

package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

	// INT BYTE SHORT LONG ---> Primitive Types
		int myValue = 10000;
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println(myValue);
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
		System.out.println(myTotal);
        System.out.println(myNewByteValue);
		short myNewShortvalue = (short) (myMinShort / 2);
		System.out.println(myNewShortvalue);

	// CHALLENGE 1: 
	// Create a Byte, Short and Int.
	// ADD 50k + 10* the sum of three vars created.
	byte myChByte = 100;
	short myChShort =	30000;
	int myChInt = 69900;
	long myChLongTotal = 50000L +10L * (myChByte + myChShort + myChInt) ;
	System.out.println("My Challenge Total: " + myChLongTotal);

	// FLOAT DOUBLE ---> Primitive Types
	

    }
}

package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

	// INT BYTE SHORT LONG ---> Primitive Types
		// int myValue = 10000;
		// int myMinIntValue = Integer.MIN_VALUE;
		// int myMaxIntValue = Integer.MAX_VALUE;
		// System.out.println(myValue);
		// System.out.println("Integer Minimum = " + myMinIntValue);
		// System.out.println("Integer Maximum = " + myMaxIntValue);
		// System.out.println("Overflowed the MAX Value : " + (myMaxIntValue + 1));

		// byte myMinByte = Byte.MIN_VALUE;
		// byte myMaxByte = Byte.MAX_VALUE;
		// System.out.println(myMinByte);
		// System.out.println(myMaxByte);

		// short myMinShort = Short.MIN_VALUE;
		// short myMaxShort = Short.MAX_VALUE;
		// System.out.println(myMinShort);
		// System.out.println(myMaxShort);

		// long myLong = 100L;
		// long myMinLong = Long.MIN_VALUE;
		// long myMaxLong = Long.MAX_VALUE;
		// System.out.println(myLong);
		// System.out.println(myMinLong);
		// System.out.println(myMaxLong);

	// Arithmetic and Casting
        // int myTotal = (myMinIntValue / 2);		
        // byte myNewByteValue = (byte)(myMinByte / 2);
		// System.out.println(myTotal);
        // System.out.println(myNewByteValue);
		// short myNewShortvalue = (short) (myMinShort / 2);
		// System.out.println(myNewShortvalue);

	// ------------ CHALLENGE 1 -------------
	// Create a Byte, Short and Int.
	// ADD 50k + 10* the sum of three vars created.
		// byte myChByte = 100;
		// short myChShort =	30000;
		// int myChInt = 69900;
		// long myChLongTotal = 50000L +10L * (myChByte + myChShort + myChInt) ;
		// System.out.println("My Challenge Total: " + myChLongTotal);

	// FLOAT DOUBLE ---> Primitive Types
		// float myMinFloatValue = Float.MIN_VALUE;
		// float myMaxFloatValue = Float.MAX_VALUE;
		// System.out.println(myMinFloatValue);
		// System.out.println(myMaxFloatValue);
		
		// double myMinDoubleValue = Double.MIN_VALUE;
		// double myMaxDoubleValue = Double.MAX_VALUE;
		// System.out.println(myMinDoubleValue);
		// System.out.println(myMaxDoubleValue);

		// int myInt = 5 / 2;
		// float myFloat = 5.25f / 2f;
		// double myDouble = 5.25d / 2d;
		// System.out.println("my Int: " + myInt + " Gets TRUNCATED downwards");
		// System.out.println("my Float: " + myFloat);
		// System.out.println("my Double: " + myDouble + " Use DOUBLE ALWAYS, they are FASTER than FLOATS");

	// ------------ CHALLENGE 2 -------------
	// Convert Punds to Kilograms.
	// Variable to store PUNDS, Calculate, Print --> 1 Pound = 0.45359237Kg
		// double myPounds = 100d;
		// double myCalc = myPounds * 0.45359237d;
		// System.out.println(myPounds + " Pounds are: " + myCalc + " Kilograms");

	// CHAR and BOOLEAN ---> Primitive Types	
		// char myChar = 'D'; //Must use SINGLE QUOTES!!!!!!
		// char myUnicodeCHar = '\u0044';
		// System.out.println(myChar + " Char // Unicode: " + myUnicodeCHar );
		// char myCopyChar = '\u00A9';
		// System.out.println(myCopyChar);

		// boolean myTrue = true;
		// boolean myFalse = false;
		// System.out.println(myTrue + " and " + myFalse);

	// STRINGS ----> Primitive Type
		String myStr = "Hello World";
		System.out.println(myStr);
		myStr += " Just CONCATENATED this";
		System.out.println(myStr);
		myStr += ". All rights Reserved \u00A9 2021" ;
		System.out.println(myStr);

		int myIntStr = 50;
		String myStrforInt = "10";
		System.out.println("Adding an INT to a STR: " + myIntStr + myStrforInt + "Java knows im Adding INT to STR therefore converts the INT to STR");
    }

}

package Section3;

public class OperatorsExpressions {
    public static void main(String[] args) {
       
    // Operators and Expressions:
        // int result = 1 + 2 ;
        // System.out.println("1 + 2 = "  + result);
        // int prevResult = result;
        // System.out.println("Prev Result = " + prevResult);
        // result -= 1;
        // System.out.println("3 - 1 = " + result);
        // System.out.println("Prev Res ... After changing normal Result = " + prevResult);

        // result *= 10;
        // System.out.println("2 * 10" +result);
        // result /= 5;
        // System.out.println("20 / 5"+result);
        // result %= 3;
        // System.out.println("Modulus(Remainder after division) of 4 = " + result);
    
    // IF - THEN Statements: Conditional Logic
        // boolean isAlien = false;
        // if(isAlien == false) {
        //     System.out.println("It is NOT an Alien");
        //     System.out.println("Second line inside CODE BLOCK");
        // } else {
        //     System.out.println("It IS an Alien");
        // }

    // Logical Operators: >, =, <, >=, <=, == , AND(&&, both true), OR(||, only one true),
        // int topScore = 80;
        // if (topScore < 100){
        //     System.out.println("You got HIGHEST Score");
        // }   
        // int secondTopScore = 60;
        // // if ((topScore > secondTopScore) && (topScore < 100)){
        // // System.out.println("Greater than second , but less than 100");
        // // }   
        // if ((topScore > 90) || (secondTopScore <= 90)){
        // System.out.println("either of both conditions are true");
        // }

    // One = (Assignment Operator) is to assign, Double == is to test
    // One & or | is to comparte bitwise rather than values.

    // Not Operator !:
    //     boolean isCar = false;
    //     if (!isCar) {
    //         System.out.println("Car: False");
    //     }
    // Ternary Operator: (___) ? ___ : ___ ;
    //     isCar = true;
    //     boolean wasCar = (isCar) ? true : false;
    //     if(wasCar){
    //     System.out.println(wasCar);
    //     }

    // ---------- CHALLENGE 3 ------------
    // Create two Doubles: 20.00 and 80.00. Sum them and * 100.00.
    // % of the result and 40.00
    // Boolean true if is 0, false not 0. Then Print it
    // Else Print "Got some Reminder" if not 0.

    double myFirst = 20.00d;
    double mySec = 80.00d;
    double firstRes = (myFirst + mySec) * 100.00d;
    double remainderOfRes = firstRes % 40.00d;
    boolean isBool = ( remainderOfRes == 0) ? true : false;
    if (isBool) {        
        System.out.println("My Boolean is: " + isBool);
    } else {       
        System.out.println("Got some Remainder");
    }
    }
}

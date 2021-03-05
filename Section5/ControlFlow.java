package Section5;

public class ControlFlow {
    public static void main (String[] args) {
        // ************************
        // Switch Statement: Case - Break
        // ************************
        // int switchVal = 5;
        // switch (switchVal) {
        //     case 1: 
        //         System.out.println("Value was 1");
        //         break;
        //     case 2:
        //         System.out.println("Value was 2");
        //         break;
        //     case 3: case 4: case 5:
        //         System.out.println("Value was 3 or 4 or 5");
        //         break;
        //     default:
        //     System.out.println("Was not 1 or 2");
        //     break;
        // }

        // ***
        // Ex 1:
        // ***
        // char myChar = 'D';
        // switch(myChar) {
        //     case 'A':
        //         System.out.println("is A");
        //         break;
        //     case 'B':
        //         System.out.println("is B");
        //         break;
        //     case 'C':
        //         System.out.println("is C");
        //         break;
        //     case 'D':  case 'E':
        //         System.out.println("Found: " + myChar);
        //         break;
        //     default:
        //         System.out.println("Not Found");
        //         break;
        // }

        // ***
        // Ex 2: Using Methods to simplify:
        // ***
        // String month = "January";
        // switch (month.toLowerCase()){
        //     case "january":
        //         System.out.println("Jan");
        //         break;
        //     case "june":
        //         System.out.println("Jun");
        //         break;
        //     default:
        //         System.out.println("Not Sure");
        // }

        // Ex 3:
        // printDayOfTheWeek(5);
        // EX 4:
        // printNumberInWord(8);
        // EX 5:
        // System.out.println(isLeapYear(2017));
        // System.out.println(getDaysInMonth(2, 2000));

        // ***************************************
        //  FOR Loop --> for(Initial ; Termination; Increment){}
        // ***************************************

        // INTEREST CALC
        // System.out.println(calculateInterest(1000.0, 2.0));
        // for(int i = 2; i < 9; i++){
        //     // System.out.println("Loop Number " + i );
        //     System.out.println("For 1000$ at "+ i + "% rate you would get: " + String.format("%.2f",calculateInterest(1000, i)) + "$.");
        // };
        // for (double i = 8; i > 1; i--){
        //     System.out.println("For 1000$ at "+ i + "% rate you would get: " + String.format("%.2f",calculateInterest(1000, i)) + "$.");
        // }

        // PRIME NUMBERS
        // System.out.println(isPrime(13));
        // int count = 0;
        // for ( int i = 1; i < 51; i++) {
        //     if (isPrime(i)){
        //         count ++;               
        //     }            
        // }
        // System.out.println("Amount of Prime numbers is: " + count);

        // SUM 3 AND 5
        // int count = 0;
        // int sum = 0;
        // for (int i = 1; i <1001; i++) {
        //     if ((i % 3 == 0) && (i % 5 == 0)){
        //         count ++;
        //         sum += i;
        //         System.out.println("This number: " + i + " is Divisible by both 3 and 5.");
        //         if(count == 5){                    
        //             break;
        //         }
        //     }
        // }
        // System.out.println("All numberes sum: " + sum);

        // SUM ODD
        // System.out.println(isOdd(11));
        // System.out.println(sumOdd(100, 1000));

        // ****************************
        // While - Do  LOOPS
        // ****************************
        // int count = 1;
        // while (count != 6) {
        //     System.out.println("Current Count: "+ count);
        //     count++;
        // };
        // count = 1 ;
        // do {
        //     System.out.println("DOing count: " + count);
        //     count++;
        // } while (count != 6);
        // int number = 4;
        // int finishNumber = 20;
        // int count = 0;
        // while ((number <= finishNumber) && (count<=5)){
        //     number++;
        //     if (!isEvenNumber(number)){
        //         continue;
        //     }            
        //     System.out.println("Even Num: " + number);            
        //     count++;
        // }
        // System.out.println("Total Even Numbers found: " + count);

        // System.out.println("Sum of Digits in: 125 is: " +  sumDigits(12));

    }

        // ***
        // Ex 3: Challenge Days of Week.
        // ***

        // public static void printDayOfTheWeek (int day) {
        //     switch (day) {
        //         case 0: 
        //             System.out.println("Sun");
        //             break;
        //         case 1: 
        //             System.out.println("Mon");
        //             break;
        //         case 2: 
        //             System.out.println("Tue");
        //             break;
        //         case 3: 
        //             System.out.println("W");
        //             break;
        //         case 4: 
        //             System.out.println("T");
        //             break;
        //         case 5: 
        //             System.out.println("F");
        //             break;
        //         case 6: 
        //             System.out.println("S");
        //             break;
        //         default: 
        //             System.out.println("Invalid");
        //             break;
        //     }
        // }

        // ***
        // Ex 4
        // ***
        // public static void printNumberInWord(int number){
        //     switch (number) {
        //         case 0:
        //             System.out.println("ZERO");
        //             break;                
        //         case 1:
        //             System.out.println("ONE");
        //             break;
        //         case 2:
        //             System.out.println("TWO");
        //             break;                
        //         case 3:
        //             System.out.println("THREE");
        //             break;
        //         case 4:
        //             System.out.println("FOUR");
        //             break;                
        //         case 5:
        //             System.out.println("FIVE");
        //             break;
        //         case 6:
        //             System.out.println("SIX");
        //             break;                
        //         case 7:
        //             System.out.println("SEVEN");
        //             break;
        //         case 8:
        //             System.out.println("EIGHT");
        //             break;
        //         case 9:
        //             System.out.println("NINE");
        //             break;
        //         default: 
        //             System.out.println("OTHER");
        //             break;                
        //     }
        // }

        // ***
        // Ex 5
        // ***
        // public static boolean isLeapYear(int year) {
        //     if ((year < 1) || (year >=9999)){
        //         return false;
        //     } else {                
        //         return (((year % 4 == 0) && (year % 100 != 0 ))|| (year%400 == 0));               
        //     }            
        // }
        // public static int getDaysInMonth(int month, int year) {            
        //     if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
        //         return -1;
        //     } else if (isLeapYear(year)  && month == 2) {
        //         return 29;
        //     }   else {
        //         switch(month){
        //             case 11: case 4: case 6: case 9: 
        //                 return 30;                        
        //             case 2: 
        //                 return 28;
        //             default:
        //                 return 31;                        
        //         }
        //     }
        // }

        // *****************************
        // FOR Loop
        // *****************************
        // INTEREST CALC
        // public static double calculateInterest (double amount, double interestRate){
        //     return (amount *(interestRate/100));
        // }
        // PRIME NUMBERS
        // public static boolean isPrime (int num){
        //     if (num == 1 ){
        //         return false;
        //     }
        //     for (int i=2; i <= num/2; i ++) {
        //         if (num % i == 0) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        // SUM 3 AND 5
        // SUM ODD
        // public static boolean isOdd (int number){
        //     if (number <= 0){
        //         return false;
        //     } else {
        //         if(number % 2 == 0){
        //             return false;
        //         }
        //     }   
        //     return true;          
        // }
        // public static int sumOdd (int start, int end){
        //     int sum = 0;
        //     int myEnd = end + 1;
        //     if( (end < start) || (end < 0) || (start < 0)){
        //         return -1;
        //     } else {
        //         for (int i = start; i < myEnd; i++){
        //             if(isOdd(i)){
        //                 sum += i;
        //             }
        //         }
        //         return sum;
        //     }
        // }

        // ****************************
        // While - Do  LOOPS
        // ****************************
        // public static boolean isEvenNumber(int par){
        //    if (par % 2 == 0) {
        //        return true;
        //    } 
        //    return false;
        // }

        // public static int sumDigits ( int number) {
        //     if(number < 10) {
        //         return -1;
        //     } 
        //     int sum = 0;

        //     while (number > 0){
        //         // Get Least-significant digit:
        //         int digit = number % 10;
        //         sum += digit;

        //         // Drop the Least significant digit:
        //         number /= 10;
        //     }
        //     return sum;
        // }  
}

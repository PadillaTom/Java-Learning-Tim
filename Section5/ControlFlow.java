package Section5;

public class ControlFlow {
    public static void main (String[] args) {
        // Switch Statement: Case - Break
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
    System.out.println(isLeapYear(2017));
    System.out.println(getDaysInMonth(2, 2000));

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
        public static boolean isLeapYear(int year) {
            if ((year < 1) || (year >=9999)){
                return false;
            } else {                
                return (((year % 4 == 0) && (year % 100 != 0 ))|| (year%400 == 0));               
            }            
        }
        public static int getDaysInMonth(int month, int year) {            
            if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
                return -1;
            } else if (isLeapYear(year)  && month == 2) {
                return 29;
            }   else {
                switch(month){
                    case 11: case 4: case 6: case 9: 
                        return 30;                        
                    case 2: 
                        return 28;
                    default:
                        return 31;                        
                }
            }
        }

}

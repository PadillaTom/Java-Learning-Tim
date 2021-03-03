package Section4;
public class TutPart1EX {
   public static void main(String[] args) {
    // Excercise 1
        // toMilesPerHour(1.5);
        // printConversion(2.00);   
    // Excercise 2
        // printMbAndKb(2500);
    // Excercise 3
        // shouldWakeUp(true , 2);
    // Excercise 4
        // System.out.println(isLeapYear(2000));    
    // Excercise 5
        // System.out.println(areEqualByTrheeDecimalPlaces(3.141, 3.141));
    // Excercise 6
        // System.out.println(hasEqualSum(1, 3, 3));
    // Exercise 7
        // System.out.println(hasTeen(12, 22, 25));
        // System.out.println(isTeen(13));

    }

    //  Ex 1:
    //   public static long toMilesPerHour(double kmPerHour) {
    //           if(kmPerHour < 0) {
    //               return -1;
    //           } else  {
    //               long myRound = Math.round(kmPerHour / 1.609);
    //               System.out.println(myRound);
    //             return myRound;   
    //           }           
    //       }
    // public static void printConversion (double kmPerHour){
    //   long myMiles = Math.round(kmPerHour * 0.621371)  ;
    //   if(kmPerHour < 0 ) {
    //     System.out.println("Invalid Value");
    //   } else {
    //     System.out.println(kmPerHour + " Km/h" +" = "+ (double) myMiles + " Mi/h");
    //   }      
    // } 

    //  Ex 2:
    // public static void printMbAndKb(int Kb) {
    //     if(Kb < 0 ){
    //       System.out.println("Invalid Value");
    //       } else {
    //         int myMb = Kb / 1024;
    //         int myRem = Kb % 1024;
    //         System.out.println(Kb + " KB = " + myMb + " MB and " + myRem + " KB" );
    //       }
    //   }

    //  Ex 3:
    // public static boolean shouldWakeUp(boolean barking , int hourOfDay) {    
    //   if (!barking  || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
    //     return false;
    //   } 
    //     return true;        
    // }

    // Ex 4:
    // public static boolean isLeapYear (int year) {
    //   if (year >= 1 && year <= 9999) {
    //       if ((year %400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
    //           return true;
    //       } else {
    //           return false;
    //       }
    //   } else {
    //       return false;
    //   }
    // }

    // Ex 5:
    // public static boolean areEqualByTrheeDecimalPlaces (double par1, double par2){
    //     // Multiplicamos por 1000 para convertirlo a numeros enteros; luego comparar.
    //     int myPar1 = (int) (par1 * 1000);
    //     int myPar2 = (int) (par2 * 1000);
    //     if (myPar1 - myPar2 == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // Ex 6:
    // public static boolean hasEqualSum (int par1, int par2, int par3) {
    //     if ((par1 + par2 ) == par3){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // Ex 7:
    //     public static boolean hasTeen (int par1, int par2, int par3){
    // if ((par1 >= 13 && par1 <= 19) || (par2 >= 13 && par2 <= 19)   || (par3 >= 13 && par3 <= 19)){
    //     return true;
    // } else {
    //     return false;
    // }
    //     }
    //     public static boolean isTeen (int par4) {
    //         if (par4 >= 13 && par4 <=19) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     }
}
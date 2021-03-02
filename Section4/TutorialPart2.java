public class TutorialPart2 {
    public static void main (String[] args){

        // METHOD OVERLOADING --------
        // Multiple methods can have the same name with different parameters.
        // Instead of defining two methods that should do the same thing, it is better to overload one.
        // 
        // //  Case 1:
        // int newScore = calculateScore ("Tim", 500);        
        // System.out.println("New Score is" + " " + newScore);        
        // //  Case 2:
        // calculateScore(250);
        // //  Case 3:
        // calculateScore();

        // ------------------
        // ::: EXERCISE 1 :::
        // ------------------
        double checker = calcFeetAndInchesToCentimeters(6,0);
        if (checker < 0.0) {
            System.out.println("Invalid Parameters");
        }    
        calcFeetAndInchesToCentimeters(100);

    }

    // Methods:
        // //  Case 1:
        // public static int calculateScore (String player, int score){
        //     System.out.println("*****");
        //     System.out.println("Player: " + player + " - Scored: " + score);
        //     return score;
        // }
        // // Case 2:
        // public static int calculateScore (int score){
        //     System.out.println("*****");
        //     System.out.println("Unnamed Player - Scored: " + score);
        //     return score;
        // }
        // // Case 3:
        // public static int calculateScore (){
        //     System.out.println("*****");
        //     System.out.println("Unnamed Player - Scored: No Score");
        //     return 0;            
        // }


        // ------------------
        // ::: EXERCISE 1 :::
        // ------------------
        // 1 foot = 12 inches -- 1 inch = 2.54cm
 public static double calcFeetAndInchesToCentimeters (double parFeet, double parInches ) {
     if ((parFeet >= 0) && (parInches >= 0 && parInches <= 12)) {
       double centimeters = (parFeet * 12 * 2.54) + (parInches * 2.54);
       System.out.println(parFeet + " Feet and " + parInches + " Inches = " + centimeters + " Centimeters");
       return (centimeters);
        
     } else {
         System.out.println("Invalid Parameters");
         return -1;
     }
 }
 public static double calcFeetAndInchesToCentimeters(double parInches) {
     if (parInches >= 0 ) {
         double myFeet =  (int)parInches / 12 ;
         double myFeetRem = (int) parInches % 12;
         System.out.println(" *** \n" + parInches + " Inches = " + myFeet + " Feet and " + myFeetRem);         
         return calcFeetAndInchesToCentimeters(myFeet, myFeetRem);
     }  else {
          return -1;
      }
 }

}

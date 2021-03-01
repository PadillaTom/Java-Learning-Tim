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
        calcFeetAndInchesToCentimeters(0, 8);

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
 public static double calcFeetAndInchesToCentimeters (int parFeet, int parInches ) {
     if ((parFeet >= 0) && (parInches >= 0 && parInches <= 12)) {
        System.out.println("Hi");
        return 1;
     } else {
         return -1;
     }
 }

}

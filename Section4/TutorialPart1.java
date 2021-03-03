package Section4;
public class TutorialPart1 {
    public static void main(String[] args) {
    // Keywords and expressions
        // There are reserved keywords that cannot be used.
        // Expressions: everything after DOUBLE
        // double km = (100d* 1.609344d);
        // System.out.println(km);

    // Statements: Everything before ; Java doesn't care about Whitespace
        // int myVar =50;
        // myVar ++;
        // System.out.println(myVar);

    // Code Block: For exmaple on an IF statement {}, oudside the bock we cannot access its content.
        // if (50 > 25 ){
        //     System.out.println("Hi");
        // }

    // --------- CHALLENGE 4 -----------
    // Print out a score of 10000, Level complete: 8, Bonus: 200.
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;   
        // if(gameOver){
        //     int finalScore = score + (levelCompleted*bonus);
        //     System.out.println("1) Final score: " + finalScore);
        // }
        // boolean newGO = true;
        // int newScore = 10000;
        // int newLvlComp = 8;
        // int newBonus = 200;
        // if(newGO) {
        //     int finalScore = newScore + (newLvlComp*newBonus);
        //     System.out.println("2) Final Score: " + finalScore);
        // }

    // Using Methods: We created calculateScore and we run it here
    // The code will run up to here, execute the Method created down, and continue its flow after invokind it.
        // System.out.println("Code BEFORE method is Called");
        // int returnedStuff = calculateScore(31, "Thomas", true);
        // System.out.println("Code AFTER Method is invoked");
        // System.out.println(returnedStuff);

    // DiffMerge Tool: Will help us to visually compare and merge files on any o.s.
    
        
    }
    
    // Creating Methods:
        // public static int calculateScore(int age, String name, boolean married){
        //     System.out.println("--- User Info ---" );
        //     System.out.println("Name: " + name);
        //     System.out.println("Age: " + age);
        //     System.out.println("Married: " + married);
        //     System.out.println("---------");
        //     return 500;
        // }
}

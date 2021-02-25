public class Excercises {
   public static void main(String[] args) {
    // Excercise 1
   toMilesPerHour(1.5);
   
    // Excercise 2
    // Excercise 3
    // Excercise 4
    // Excercise 5
    // Excercise 6
   } 
    //    Ex 1:
  public static long toMilesPerHour(double kmPerHour) {
          if(kmPerHour < 0) {
              return -1;
          } else  {
              long myRound = Math.round(kmPerHour / 1.609);
              System.out.println(myRound);
            return myRound;   
          } 
       
      }
public static void printConversion (double kmPerHour){
    System.out.println("hi");
} 
}

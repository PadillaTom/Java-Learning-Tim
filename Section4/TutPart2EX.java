public class TutPart2EX {
    public static void main (String[] args ) {
        // Excercise 8
        // System.out.println(area(-1));
        // System.out.println(area(-5,4));
        // Excercise 9
        // printYearsAndDays(561600);
        // Excercise 10
        // printEqual(2, 2, 2);
        // Excercise 11
        // System.out.println(isCatPlaying(false, 36));
    }
// Constants:
// public static final double PI_VALUE = Math.PI;

    // Methods:

    // Ex 8
    // public static double area(double radius){
    //     if(radius < 0) {
    //         return -1.0;
    //     } else {
    //         double myArea = PI_VALUE * (radius * radius);
    //         return myArea;
    //     }
    // }
    // public static double area (double x , double y) {
    //     if (x < 0 || y < 0) {
    //         return -1.0;
    //     } else {
    //         double myArea = (x * y);
    //         return myArea;
    //     }
    // }

    // Ex 9
    // public static void printYearsAndDays (long minutes) {
    //     if (minutes <0 ) {
    //         System.out.println("Invalud Value");
    //     } else {
    //         long myYear = minutes / 525600l;
    //         long remMinY = minutes % 525600l;
    //         long myDays = remMinY / 1440l;
    //         System.out.println( minutes + " min = " + myYear + " y and " + myDays + " d");
    //     }
    // }

    // Ex 10
    // public static void printEqual(int par1, int par2, int par3) {
    //     if (par1<0 || par2<0 || par3<0) {
    //         System.out.println("Invalid Value");
    //     } else if (par1 == par2 && par2 == par3){
    //         System.out.println("All numbers are equal");
    //     } else if ((par1 != par2) && (par1 != par3) && ( par2 != par3)){
    //         System.out.println("All numbers are different");
    //     } else {
    //         System.out.println("Neither all are equal or different");
    //     }
    // }

    // Ex 11
    // public static boolean isCatPlaying (boolean summer, int temperature){
    //    if(summer == false) {
    //        if (temperature >= 25 && temperature <= 35) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    } else if (summer == true) {
    //         if (temperature >= 25 && temperature <= 45) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    } else {
    //        return false;
    //    }
    // }
}


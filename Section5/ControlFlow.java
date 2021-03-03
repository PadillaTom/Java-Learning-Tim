package Section5;

public class ControlFlow {
    public static void main (String[] args) {
        // Switch Statement: Case - Break
        int switchVal = 5;
        switch (switchVal) {
            case 1: 
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;
            default:
            System.out.println("Was not 1 or 2");
            break;
        }

        // ***
        // Ex 1:
        // ***
        char myChar = 'D';
        switch(myChar) {
            case 'A':
                System.out.println("is A");
                break;
            case 'B':
                System.out.println("is B");
                break;
            case 'C':
                System.out.println("is C");
                break;
            case 'D':  case 'E':
                System.out.println("Found: " + myChar);
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        // ***
        // Ex 2: Using Methods to simplify:
        // ***
        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }
    }
}

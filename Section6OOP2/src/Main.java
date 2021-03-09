public class Main {

    public static void main (String[] args) {
//        ********* COMPOSITION **********
//        We create CLASSES that hold Methods, Variables, Classes...
//        Then we can Create a PARENT Class, that holds The stuff said before

        Dimensions dimensions = new Dimensions(20,20,5);

        Case theCase = new Case("220B", "Dell", "240", dimensions );
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC (theCase, theMonitor, theMotherboard);

//  Accessing Methods
//        COMPOSITION 1: Public methods accessed by PC
//        thePC.getMonitor().drawPixelAt(1500,1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

//        COMPOSITION 2: Private Methods accessed internally.
        thePC.powerUp();
    }

}

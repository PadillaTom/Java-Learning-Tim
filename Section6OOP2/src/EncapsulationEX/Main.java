package EncapsulationEX;

public class Main {
    public static void main (String[] args) {
        Printer printer = new Printer (50, true);
        System.out.println("Initial Page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ", new count of pages printed: " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + ", new count of pages printed: " + printer.getPagesPrinted());
    }
}


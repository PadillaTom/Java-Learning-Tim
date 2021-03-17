package LinkedList;

public class Main {
    public static void main(String[] args) {
        // How JAVA uses memory:
        Customer customer = new Customer("Tom",100.0);
        Customer anotherCustomer;

        // Here JAVA didn't create another class, he POINTED 2nd class to the 1st class IN MEMORY:
        anotherCustomer = customer;
        anotherCustomer.setBalance(50.00); // Saved value in the original memory.
        System.out.println("Balance for Customer: " +customer.getName() + " is " + customer.getBalance());

        // If we have a normal ARRAY and we ADDan item in the middle,
        // JAVA will have to move everything DOWN... Putting a lot of preassure to the program.
        // Same for REMOVING something in the middle of the array.
        // JAVA will have to move everything UP

        // *** LINKED LIST does it in a much faster way ***




    }
}

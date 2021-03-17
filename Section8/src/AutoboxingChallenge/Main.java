package AutoboxingChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Toms Bank");
        bank.addBranch("Suiza");

        bank.addCustomer("Suiza", "Tom", 50.05);
        bank.addCustomer("Suiza", "Katy", 200.05);
        bank.addCustomer("Suiza", "July", 150.0);

        bank.addBranch("France");
        bank.addCustomer("France", "Rafa", 5000.0);

        bank.addCustomerTransaction("Suiza","Tom", 49.05);

//        Comenzamos:
        bank.listCustomers("Suiza", false);

    }
}

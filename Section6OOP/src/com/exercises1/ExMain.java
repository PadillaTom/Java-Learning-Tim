package com.exercises1;

public class ExMain {
    public static void main(String[] args) {

        BankAccount tom = new BankAccount(0001, 0, "Tomas Padilla", "tom@email.com", "+41000");
//  UPLOADING MANUALLY: ; we will Use CONSTRUCTORS to prevent all the hard work.
//        tom.setAccNum(0001);
//        tom.setBalance(0);
//        tom.setCustomerName("Tomas Padilla");
//        tom.setEmail("Padilla@hello.com");
//        tom.setPhoneNum("+41794002693");

//        tom.withdrawal(100);
//        tom.deposit(500);
//        tom.withdrawal(250);
//        tom.withdrawal(300);

        VIPPerson katy = new VIPPerson();
        System.out.println(katy.getName());

        VIPPerson july = new VIPPerson("July", 25000);
        System.out.println(july.getName());

        VIPPerson rafa = new VIPPerson("Rafa", 100, "rafa@rafa.com");
        System.out.println(rafa.getName() + ", " + rafa.getEmail());

    }
}

package Interfaces;

public class Main {
    public static void main(String[] args) {

//        *** Desktop Phone ***
//        Interface:
        ITelephone timsPhone;
//        Class --> That overwrites the interface:
        timsPhone = new DeskPhone(47994058);

        timsPhone.powerOn();
        timsPhone.callPhone(47994058);
        timsPhone.answer();

        System.out.println("******");

//        *** Mobile Phone ***
        timsPhone = new MobilePhone(1550148853);
        timsPhone.powerOn();
        timsPhone.callPhone(1550148853);
        timsPhone.answer();

    }
}

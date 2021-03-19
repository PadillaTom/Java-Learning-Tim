package Interfaces;

//  We do not write code inside INTERFACE, just the methods that has to implement.
//  Once implemented MUST USE ALL methods.
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}

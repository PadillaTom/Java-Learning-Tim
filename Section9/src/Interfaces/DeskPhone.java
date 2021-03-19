package Interfaces;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //    Implementing INTERFACE: Must use ALL methods.
    @Override
    public void powerOn() {
        System.out.println("No action, DeskPhone does not have Power Button.");
    }
    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing: " +phoneNumber + "on DeskPhone.");
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering DeskPhone");
            isRinging = false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }

}

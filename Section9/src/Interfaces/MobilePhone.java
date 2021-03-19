package Interfaces;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //    Implementing INTERFACE: Must use ALL methods.
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("MobilePhone powered up");
    }
    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now dialing: " +phoneNumber + "on MobilePhone.");
        } else {
            System.out.println("Not powered.");
        }
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering MobilePhone");
            isRinging = false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Mobile Ring");
        } else {
            isRinging = false;
            System.out.println("Not powered.");
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }

}

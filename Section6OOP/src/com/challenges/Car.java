package com.challenges;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

//    Constructor:
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
//    Methods:
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("CAR Changed GEAR to " + this.currentGear);
    }
    public void changeVelocity(int speed, int direction){
        System.out.println("CAR VEL and DIR (MOVE from vehicle) --> Vel: " + speed + ", Dir: " + direction );
//     Inherited from Vehicle (MOVE)
        move(speed, direction);
    }
}

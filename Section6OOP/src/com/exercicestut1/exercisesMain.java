package com.exercicestut1;

public class exercisesMain {
    public static void main (String[] args) {
//        My Wall:
        Wall myWall = new Wall(5,6);
        System.out.println("Width: " + myWall.getWidth());
        System.out.println("Height: " + myWall.getHeight());
        System.out.println("Total Area: " + myWall.getArea());

//        My Point:
        Point myPoint1 = new Point(6,5);
        Point myPoint2 = new Point (3,1);
        System.out.println(myPoint1.distance(0,0));
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint1.distance(2,2));

//        Carpet Cost:
        Carpet myCarpet = new Carpet( 5.0);
        Floor myFloor = new Floor (10,12);
        Calculator tomFloor = new Calculator(myFloor, myCarpet);
        System.out.println("Tomas Floor: " + myFloor.getArea() +" m2.");
        System.out.println("Carpet cost: " + myCarpet.getCost() + "CHF x m2.");
        System.out.println("Total Cost: " + tomFloor.getTotalCost());
    }
}

package com.classestutorial2;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

//    Inheritance:
    public Fish(String name,  int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
//    Methods:

}

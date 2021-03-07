package com.exercicestut1;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

//    Constructors:
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
//    Methods:
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

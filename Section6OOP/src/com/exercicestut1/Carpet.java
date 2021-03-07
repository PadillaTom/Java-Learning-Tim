package com.exercicestut1;

public class Carpet {
    private double cost;

//    Constructors:
    public Carpet(double cost) {
        this.cost = cost <0 ? 0 : cost;
    }
//    Methods:
    public double getCost (){
        return cost;
    }
}


package com.challenges;

public class ChMain {
    public static void main(String[] args){
//   Probamos la OUTLANDER
        Outlander myOutlander = new Outlander(36);
        myOutlander.steer(45);
        myOutlander.accelerate(30);
        myOutlander.accelerate(20);
        myOutlander.accelerate(-42);
    }
}

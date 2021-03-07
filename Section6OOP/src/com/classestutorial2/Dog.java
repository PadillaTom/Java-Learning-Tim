package com.classestutorial2;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private  String coat;

//    Inheritance form ANIMAL
//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }
//    A la Inheritance we add Default Values: General for DOGS.
//    Constructor:
        public Dog(String name,  int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
//    Methods for Dogs:
    private void chew() {
        System.out.println("and Chewing");
    }

//    Overriding Inherited Methods (ALT + INSERT)
    @Override
    public void eat() {
        System.out.println("**Overwrote Animal EAT** --> DOG.EAT()");
        chew();
        super.eat();
    }
}

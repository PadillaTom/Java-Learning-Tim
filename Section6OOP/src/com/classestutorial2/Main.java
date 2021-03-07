package com.classestutorial2;

public class Main {
    public static void main (String[] args) {

//        Inheritance: Share some properties of different classes.
//        DOG will receive form ANIMAL.
//        DOG will also have his own values.
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog myDog = new Dog("Rafa", 10, 20,2,4,1,32,"Big Fury");
//        Accessing Animal Methods:
        System.out.println(myDog.getName());
        myDog.eat();

//        FISH

    }
}

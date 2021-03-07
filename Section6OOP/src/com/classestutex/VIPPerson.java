package com.classestutex;

public class VIPPerson {
    private String name;
    private double creditLimit;
    private String email;

//    *** CONSTRUCTORS ***
//    Defaults:
    public VIPPerson(){
        this("Default Name", 50000.00, "Email");
    }
//    NO Email:
    public VIPPerson(String name, double creditLimit) {
this(name, creditLimit, "NO Email");
    }
// All Data:
    public VIPPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

//    *** Getters ***
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}

package com.classestutorial;

public class Car {
//    These variables are STATE of the car.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
//    PUBLIC = We can access from other files
//    PRIVATE = Only can access within this class.

//    Methods
//    --> SETTER:
    public void setModel(String model){
//        Example of Validation: Helpful to prevent mistakes, Making the data
//        comming IN and OUT of a CLASS are correct.
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
        this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
//   --> GETTER:
    public String getModel() {
        return this.model;
    }


}

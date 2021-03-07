package com.exercises1;

public class SimpleCalculator {
//    Instance Variables:
    private double firstNumber;
    private double secondNumber;

//    Getters:
    public double getFirstNumber(){
        return this.firstNumber;
    };
    public double getSecondNumber(){
        return this.secondNumber;
    };

//    Setters:
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    };
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    };

//    Methods:
    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }
    public double getSubtractionResult() {
        return (firstNumber-secondNumber);
    }
    public double getMultiplicationResult() {
        return (firstNumber*secondNumber);
    }
    public double getDivisionResult() {
        if(secondNumber == 0){
            return 0;
        } else {
        return (firstNumber/secondNumber);
        }
    }
}

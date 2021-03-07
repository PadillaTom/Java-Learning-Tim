package com.exercises1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
//    Getters:
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
//    Setters:
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = (age<0 || age>100) ? 0 : age;
    }
//     Methods:
    public boolean isTeen() {
        return (age > 12 && age < 20);
    }
    public String getFullName() {
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (firstName.isEmpty()) ? lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName;
    }
}

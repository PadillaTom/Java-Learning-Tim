package com.classestutex;

public class BankAccount {
    private int accNum;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

//  ASSIGNING DEFAULT:
    public BankAccount(){
        this(0000, 0, "Name", "Email", "Phone");
    }
//  CONSTRUCTORS:
    public BankAccount(int accNum, double balance, String customerName, String email, String phoneNum ) {
        this.accNum = accNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

//  Getters:
    public int getAccNum() {
        return accNum;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
//  Setters:
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
// Methods:
       public void deposit(double depositAmount) {
            this.balance += depositAmount;
           System.out.println("New Balance: " + this.balance);
       }
       public void withdrawal(double withdrawalAmount) {
            if(this.balance - withdrawalAmount < 0){
                System.out.println("Not enough amount");
            } else{
                this.balance -= withdrawalAmount;
                System.out.println("New Balance: " + this.balance);
            }
       }

}

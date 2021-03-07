package com.exercicestut1;

public class Wall {
    private double width;
    private double height;

//    Constructors
    public Wall() {
       this(0, 0);
    }
    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

//    Getters:
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
//    Setters:
    public void setWidth(double width) {
        this.width = width<0 ? 0 : width;
    }
    public void setHeight(double height) {
        this.height = height<0 ? 0 : height;
    }
//    Methods:
    public double getArea(){
        return (width*height);
    }
}


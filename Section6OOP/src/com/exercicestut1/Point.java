package com.exercicestut1;

public class Point {
    private int x;
    private int y;

//    Constructors:
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
//    Getters:
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
//    Setters:
    public void setX(int x) {
        this.x = x;
    }
    public void setY (int y) {
        this.y = y;
    }
//    Methods:
    public double distance (){
        return Math.sqrt( (0-getX()) * ( 0 - getX()) + (0 - getY()) * (0 - getY()));
    }
    public double distance( int x, int y) {
        return Math.sqrt( (x-getX()) * (x-getX()) + (y-getY()) * (y-getY()) ) ;
    }
    public double distance( Point xy){
        return Math.sqrt( (xy.getX() - getX()) * (xy.getX()-getX()) + (xy.getY() - getY()) * (xy.getY() - getY())  );
    }
}

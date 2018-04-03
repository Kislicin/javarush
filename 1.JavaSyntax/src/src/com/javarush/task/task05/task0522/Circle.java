package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius){
        this.y = y;
        this.x = x;
        this.radius = radius;
    }

    public Circle(){
        this.radius = 0;
        this.y = 0;
        this.x = 0;
    }

    public Circle(double x){
        this.x = x;
        this.y = 1;
        this.radius = 1;
    }

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public static void main(String[] args) {

    }
}
package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left, top, width, height;

    public void initialize (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize (int left, int height){
        this.left = left;
        this.height = height;
        this.top = 0;
        this.width = 0;
    }

    public void initialize(int left, int height, int width){
        this.left = left;
        this.height = height;
        this.width = width;
        this.top = width;
    }

    public void initialize(Rectangle rectangle){
        this.top = rectangle.top;
        this.height = rectangle.top;
        this.width = rectangle.width;
        this.left = rectangle.left;
    }

    public static void main(String[] args) {

    }
}

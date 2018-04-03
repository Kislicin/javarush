package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name, address, color;
    private int age, weight;

    public void initialize(String name){
        this.name = name;
        this.color = "green";
        this.age = 2;
        this.weight = 4;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "green";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "green";
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 2;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}

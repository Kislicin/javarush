package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private String address;
    private String color;
    private int age;
    private int weight;

    public Cat (String name){
        this.name = name;
        this.age = 2;
        this.color = "blue";
        this.weight = 2;
    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "blue";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "blue";
        this.weight = 2;
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }


    public static void main(String[] args) {

    }
}

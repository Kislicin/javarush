package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int minus(int a, int b) {
        int sum = a-b;
        return sum;
    }

    public static int multiply(int a, int b) {
        int sum = a*b;
        return sum;
    }

    public static double division(int a, int b) {
        double sum = (double)a/b;
        return sum;
    }

    public static double percent(int a, int b) {
        double sum = (a*b)/100.0;
        return sum;
    }

    public static void main(String[] args) {

    }
}
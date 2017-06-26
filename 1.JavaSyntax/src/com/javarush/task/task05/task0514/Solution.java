package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person per = new Person();
        per.initialize("Peter", 25);
    }

    static class Person {
        String name;
        int age;

        public void initialize (String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}

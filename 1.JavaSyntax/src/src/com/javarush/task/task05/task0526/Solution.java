package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {


    public static void main(String[] args) {
        Man man1 = new Man("Peter", 25, "Baker st, 32");
        Man man2 = new Man("Vasily", 32, "Nagatinskaya nab, 19");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Anna", 29, "Buzeninova, 24/1");
        Woman woman2 = new Woman("Valeriya", 20, "Sudostroitelniy prd, 18");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        private String name, address;
        private int age;

        public Man(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString(){
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        private String name, address;
        private int age;

        public Woman(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString(){
            return this.name + " " + this.age + " " + this.address;
        }
    }


}

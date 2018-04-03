package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName, lastName, thirdName;
        private boolean sex, married;
        private Human love;

        public Human (){
            this.firstName = "noName";
        }

        public Human (String firstName, String lastName, String thirdName, boolean sex, boolean married, Human love){
            this.firstName = firstName;
            this.lastName = lastName;
            this.thirdName = thirdName;
            this.sex = sex;
            this.married = married;
            this.love = love;
        }

        public Human (String firstName, String lastName, String thirdName){
            this.firstName = firstName;
            this.lastName = lastName;
            this.thirdName = thirdName;
        }

        public Human (String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human (String firstName, String lastName, String thirdName, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.thirdName = thirdName;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String thirdName, boolean sex, Human love){
            this.firstName = firstName;
            this.lastName = lastName;
            this.thirdName = thirdName;
            this.sex = sex;
            this.love = love;
        }

        public Human(String firstName, boolean sex){
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(boolean sex, Human love){
            this.firstName = "noName";
            this.sex = sex;
            this.love = love;
        }

        public Human (String firstName, String lastName, boolean sex, boolean married) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.married = married;
        }

        public Human(String firstName, String lastName, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }
    }
}

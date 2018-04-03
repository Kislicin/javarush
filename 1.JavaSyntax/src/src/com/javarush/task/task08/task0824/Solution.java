package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human ch1 = new Human("Vlad",true,23);
        Human ch2 = new Human("Elena", false, 20);
        Human ch3 = new Human("Pavel", true, 27);
        ArrayList<Human> children = new ArrayList<>(Arrays.asList(ch1, ch2, ch3));
        Human father = new Human("Alex", true, 50, children);
        Human mother = new Human ("Evgeniya", false, 48, children);
        Human bab1 = new Human("Zina",false,80, new ArrayList<>(Collections.singletonList(father)));
        Human bab2 = new Human("Lucy", false, 78, new ArrayList<>(Collections.singletonList(mother)));
        Human ded1 = new Human("Pahom", true, 76, new ArrayList<>(Collections.singletonList(father)));
        Human ded2 = new Human("Ahmed", true, 79, new ArrayList<>(Collections.singletonList(mother)));
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this);
        }
        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

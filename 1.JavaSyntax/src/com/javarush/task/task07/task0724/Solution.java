package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Петр", true, 79);
        Human grandfather2 = new Human("Василий", true, 86);
        Human grandmother1 = new Human("Валерия", false, 75);
        Human grandmother2 = new Human("Мария", false, 86);
        Human father = new Human("Пахом", true, 55, grandfather1, grandmother1);
        Human mother = new Human("Вероника", false, 54, grandfather2, grandmother2);
        Human children1 = new Human("Александра", false, 25, father, mother);
        Human children2 = new Human("Алексей", true, 24, father, mother);
        Human children3 = new Human("Борис", true, 28, father, mother);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}























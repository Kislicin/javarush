package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String type = null;
        if (o instanceof Cat)
            type = "Кот";
        if (o instanceof Tiger)
            type = "Тигр";
        if (o instanceof Lion)
            type = "Лев";
        if (o instanceof Bull)
            type = "Бык";
        if (o instanceof Cow)
            type = "Корова";
        if (type == null)
            type = "Животное";
        return type;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}

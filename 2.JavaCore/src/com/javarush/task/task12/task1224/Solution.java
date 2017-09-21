package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String type=null;
        if (o instanceof Cat)
            type = "Кот";
        if (o instanceof Tiger)
            type = "Тигр";
        if (o instanceof Lion)
            type = "Лев";
        if (o instanceof Bull)
            type = "Бык";
        if (type == null)
            type = "хз";
        return type;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

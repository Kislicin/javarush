package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String,Cat> map = new HashMap<>();
        map.put("Васька",new Cat("Васька"));
        map.put("Васька1",new Cat("Васька1"));
        map.put("Васька2",new Cat("Васька2"));
        map.put("Васька3",new Cat("Васька3"));
        map.put("Васька4",new Cat("Васька4"));
        map.put("Васька5",new Cat("Васька5"));
        map.put("Васька6",new Cat("Васька6"));
        map.put("Васька7",new Cat("Васька7"));
        map.put("Васька8",new Cat("Васька8"));
        map.put("Васька9",new Cat("Васька9"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> hashSet = new HashSet();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            hashSet.add(iterator.next().getValue());
        }

        return hashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

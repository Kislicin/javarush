package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> people = new HashMap<>();
        people.put("Bill1", "Clinton");
        people.put("Bill11", "Clinton");
        people.put("Bill11", "Clinton2");
        people.put("Bill14", "Clinton");
        people.put("Bill14", "Clinton2");
        people.put("Bill14", "Clinton");
        people.put("Bill14", "Clinton");
        people.put("Bill18", "Clinton2");
        people.put("Bill19", "Clinton");
        people.put("Bill1", "Clinton");
        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

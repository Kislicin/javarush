package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> list = new HashMap<>();
        list.put("Иванов", "Иван");
        list.put("Петров","Петр");
        list.put("Скворцов","Андрей");
        list.put("Андреев","Сергей");
        list.put("Киркоров","Филипп");
        list.put("Пугачева1","Алла");
        list.put("Билан","Дмитрий");
        list.put("Чириков","Дмитрий");
        list.put("Киркоров2","Сергей");
        list.put("Пугачева","Ирина");
        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()){
            String value = entry.getValue();
            if (value.equals(name))
                i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            if (key.equals(lastName))
                i++;
        }
        return i;
    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Киркоров", "Филипп");
        map.put("Пугачева", "Алла");
        map.put("Тюрин", "Михаил");
        map.put("Аршавин", "Михаил");
        map.put("Щелкова", "Валерия");
        map.put("Агутин", "Федор");
        map.put("Пупков", "Иван");
        map.put("Пригожина", "Валерия");
        map.put("Иванов", "Петр");
        map.put("Сергеев", "Федор");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> values = new ArrayList<String>(map.values());
        for (String s1 : values){
            int count = 0;
                for (String s2 : values ){
                    if (s1.equals(s2))
                        count++;
                    if (count>=2)
                        removeItemFromMapByValue(map, s1);
                }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

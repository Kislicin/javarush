package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ваня", 600);
        map.put("Петя", 200);
        map.put("Саша", 300);
        map.put("Маша", 400);
        map.put("Сережа", 500);
        map.put("Андрей", 600);
        map.put("Леша", 500);
        map.put("Сергий", 100);
        map.put("Пелагея", 200);
        map.put("Вера", 800);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            if (map.get(key)<500){
                it.remove();
            }
        }
    }


    public static void main(String[] args) {

    }
}
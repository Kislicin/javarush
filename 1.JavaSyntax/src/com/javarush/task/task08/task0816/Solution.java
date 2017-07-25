package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Jean Clode", new Date("SEPTEMBER 8 1964"));
        map.put("Petro", new Date("MARCH 14 1992"));
        map.put("Vasso", new Date("MARCH 15 1985"));
        map.put("Mikhail", new Date("JULY 5 1948"));
        map.put("Ivan", new Date("AUGUST 12 1999"));
        map.put("Sergei", new Date("FEBRUARY 20 1979"));
        map.put("Pavel", new Date("JUNE 12 1989"));
        map.put("Aleksey", new Date("DECEMBER 1 1929"));
        map.put("Dmitry", new Date("JULY 11 1994"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Date> para = iterator.next();
            if (para.getValue().getMonth()>4 && para.getValue().getMonth()<8){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}

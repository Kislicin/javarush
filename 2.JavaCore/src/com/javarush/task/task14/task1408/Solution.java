package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        Hen getHen(String country) {
            Hen hen = null;
            if (country == Country.BELARUS){
               // hen = new BelarusianHen();
            } else if (country == Country.RUSSIA){
               // hen = new RussianHen();
            }
            return hen;
        }
    }

    public abstract class Hen {
        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я — курица.";
        }
    }


}

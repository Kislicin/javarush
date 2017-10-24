package com.javarush.task.task14.task1408;

class RussianHen {
        public int getCountOfEggsPerMonth(){
            return 100;
        }

        public String getDescription(){
            return "Я — курица. Моя страна — " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
}

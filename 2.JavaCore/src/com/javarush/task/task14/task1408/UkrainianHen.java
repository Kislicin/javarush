package com.javarush.task.task14.task1408;

class UkrainianHen {
    public int getCountOfEggsPerMonth(){
        return 110;
    }

    public String getDescription(){
        return "Я — курица. Моя страна — " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

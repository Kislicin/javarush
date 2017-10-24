package com.javarush.task.task14.task1408;

class BelarusianHen extends Solution.Hen{
    public int getCountOfEggsPerMonth(){
        return 140;
    }

    public String getDescription(){
        return "Я — курица. Моя страна — " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

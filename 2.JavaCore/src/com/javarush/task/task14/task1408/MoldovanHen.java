package com.javarush.task.task14.task1408;

class MoldovanHen {
    public int getCountOfEggsPerMonth(){
        return 80;
    }

    public String getDescription(){
        return "Я — курица. Моя страна — " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

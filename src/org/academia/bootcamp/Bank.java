package org.academia.bootcamp;

public class Bank {

    private int moneyinthebank;

    public Bank (int moneyinthebank){
        this.moneyinthebank = moneyinthebank;
    }

    public void setMoneyinthebank(int value) {
        this.moneyinthebank = moneyinthebank + value;
    }

    public int getMoneyinthebank() {
        return moneyinthebank;
    }




}

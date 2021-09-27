package org.academia.bootcamp;

public class Bank {

    private double bankBalance = 1000;



    public double getBankBalance() {
       this.bankBalance = bankBalance;
       return this.bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}

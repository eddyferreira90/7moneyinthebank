package org.academia.bootcamp;

public class Person {

    Bank bankValues = new Bank();
    Wallet walletValues = new Wallet();
    //Lojadecenas store = new Lojadecenas();
    //Job income = new Job();


    private double checkBank;
    private double checkWallet;
    private String name;

    public Person(String name){
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public double checkBank(){
        this.checkBank = bankValues.getBankBalance();
        return this.checkBank;
    }

    public double checkWallet(){
        this.checkWallet = walletValues.getWalletBalance();
        return this.checkBank;
    }
    public double add2Bank(int value){
        checkWallet();
        if(checkWallet < value){
            System.out.println("I don't have enough money. This is what I have: ");
            return checkWallet;
        }

        double bankNewBalance = checkBank + value;
        double walletNewbalance = checkWallet - value;
        bankValues.setBankBalance(bankNewBalance);
        walletValues.setWalletBalance(walletNewbalance);

        System.out.println("You transferred " + value + "€ to your account." + "\n" + "Current balance is: ");
        return bankNewBalance;
    }
}

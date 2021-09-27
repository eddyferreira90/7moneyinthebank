package org.academia.bootcamp;

public class Person {

    private String name;
    private Bank bMoney;
    private Wallet wMoney;
    private Lojadecenas lojadecenas;


    public Person(String name, Bank bMoney, Wallet wMoney){
        this.name = name;
        this.bMoney = bMoney;
        this.wMoney = wMoney;

    }

    public String getName() {
        return name;

    }

    public void checkMoneyB(){

        System.out.println("Your current account balance is " + bMoney.getMoneyinthebank() + "€." + "\n");
    }

    public void depositBank(int value){

        bMoney.setMoneyinthebank(value);
        System.out.println("You deposited " + value + " € in your bank account." + "\n");

    }

    public void withdrawFromBank(int value){

        if(bMoney.getMoneyinthebank() < value){
            System.out.println("Sorry, you don't have that much money in your account." + "\n");
        }else {
            bMoney.setMoneyinthebank(-value);
            System.out.println("You withdrew " + value + " € from your bank account." + "\n");
        }
    }

    public void trfBankToWallet(int value){

        if(bMoney.getMoneyinthebank() < value){
            System.out.println("Sorry, you don't have that much money in your account." + "\n");
        }else {
            withdrawFromBank(value);
            addToWallet(value);
            System.out.println("You transferred " + value + "€ " + "from the bank to your wallet." + "\n");
        }
    }

    public void checkMoneyW(){

        System.out.println("Your current wallet balance is " + wMoney.getMoneyinthewallet() + "€." + "\n");
    }

    public void addToWallet(int value){

        wMoney.setMoneyinthewallet(value);
        System.out.println("You added " + value + " € in your wallet." + "\n");
    }

    public void withdrawFromWallet(int value){

        if(wMoney.getMoneyinthewallet() < value){
            System.out.println("You don't have that much money in your wallet." + "\n");
        }else {
            wMoney.setMoneyinthewallet(-value);
            System.out.println("You withdrew " + value + " € from your wallet." + "\n");
        }
    }

    public void trfWalletToBank(int value){

        if(wMoney.getMoneyinthewallet() < value){
            System.out.println("You don't have that much money in your wallet." + "\n");
        }else {
            withdrawFromWallet(value);
            depositBank(value);
            System.out.println("You transferred " + value + "€ " + "from your wallet to your bank account." + "\n");
        }
    }

    /*public void buyCena1(int ){

        lojadecenas.getCena1();

    }*/




}

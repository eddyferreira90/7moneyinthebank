package org.academia.bootcamp;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Eddy", new Bank(1000), new Wallet(500));
        Lojadecenas lojadecenas = new Lojadecenas(5, 10);

        person.depositBank(200);
        person.checkMoneyB();
        person.withdrawFromBank(100);
        person.checkMoneyB();

        System.out.println(lojadecenas.getCena1());







    }
}

package com.codeclan.vendingmachine;



public class Machine {

    int balance;
    ItemA itemA;
    ItemB itemB;
    ItemC itemC;


    public Machine(){
        this.balance = 0;
        itemA = new ItemA();
        itemB = new ItemB();
        itemC = new ItemC();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addNickel(){
        this.balance = balance + 5;
    }

    public void addDime(){
        this.balance = balance + 10;
    }

    public void addQuarter(){
        this.balance = balance + 25;
    }
    public void addDollar(){
        this.balance = balance + 100;
    }

    public void coinReturn(){
        setBalance(0);
    }


    public int getItemA() {
        balance = balance - itemA.getPrice();
        return balance;
    }

    public int getItemB() {
        balance = balance - itemB.getPrice();
        return balance;
    }

    public int getItemC() {
        balance = balance - itemC.getPrice();
        return balance;
    }


}

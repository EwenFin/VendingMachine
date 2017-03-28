package com.codeclan.vendingmachine;


public class ItemB {
    int count;
    int price;
    String selector;

    public ItemB(){
        this.count = 0;
        this.price = 100;
        this.selector = "B";
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public String getSelector() {
        return selector;
    }
}

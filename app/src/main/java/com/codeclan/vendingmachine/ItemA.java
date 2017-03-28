package com.codeclan.vendingmachine;

public class ItemA {
    int count;
    int price;
    String selector;

    public ItemA(){
        this.count = 0;
        this.price = 65;
        this.selector = "A";
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

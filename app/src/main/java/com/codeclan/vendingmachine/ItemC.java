package com.codeclan.vendingmachine;



public class ItemC {
    int count;
    int price;
    String selector;

    public ItemC(){
        this.count = 0;
        this.price = 150;
        this.selector = "C";
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

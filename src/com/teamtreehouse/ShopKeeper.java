package com.teamtreehouse;

public class ShopKeeper extends Person {
    ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a ShopKeeper!";
    }

    void sellGoods() {
        //TODO: Implement sellGoods method
    }
}

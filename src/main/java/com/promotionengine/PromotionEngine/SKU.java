package com.promotionengine.PromotionEngine;

public enum SKU {
    A(Constants.A_PRICE), B(Constants.B_PRICE), C(Constants.C_PRICE), D(Constants.D_PRICE);
    private final int price;

    SKU(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}

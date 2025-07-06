package com.promotionengine.PromotionEngine;

public class BillingService {
    public int generateBill(Cart cart, PromotionEngine engine){
        return engine.applyPromotions(cart);
    }
}

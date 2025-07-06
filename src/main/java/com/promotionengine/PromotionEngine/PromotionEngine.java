package com.promotionengine.PromotionEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PromotionEngine {
    private List<Promotion> promotions = new ArrayList<>();
    
    public void addPromotion(Promotion promotion){
        promotions.add(promotion);
    }

    public int applyPromotions(Cart cart){
        int total = 0;
        Map<SKU, Integer> items = cart.getItems();

        for(Promotion promo : promotions){
            while(promo.isApplicable(items)){
                total += promo.apply(items);
            }
        }
        for(Map.Entry<SKU, Integer> entry : items.entrySet()){
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
    
}
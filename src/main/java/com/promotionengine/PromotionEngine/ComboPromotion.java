package com.promotionengine.PromotionEngine;

import java.util.Map;

public class ComboPromotion implements Promotion{
    private SKU sku1, sku2;
    private int comboPrice;

    public ComboPromotion(SKU sku1, SKU sku2, int comboPrice){
        this.sku1 = sku1;
        this.sku2 = sku2;
        this.comboPrice = comboPrice;
    }

    @Override
    public boolean isApplicable(Map<SKU, Integer> items) {
        return items.getOrDefault(sku1, 0) > 0 && items.getOrDefault(sku2, 0) > 0;
    }

    @Override
    public int apply(Map<SKU, Integer> items) {
        int quantity1 = items.getOrDefault(sku1, 0);
        int quantity2 = items.getOrDefault(sku2, 0);
        int comboCount = Math.min(quantity1, quantity2);
        int remaining1 = quantity1 - comboCount;
        int remaining2 = quantity2 - comboCount;
        items.put(sku1, remaining1);
        items.put(sku2, remaining2);
        return comboCount * comboPrice;
    }
    
}

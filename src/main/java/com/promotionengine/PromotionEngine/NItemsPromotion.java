package com.promotionengine.PromotionEngine;

import java.util.Map;

public class NItemsPromotion implements Promotion{
    private SKU sku;
    private int requiredQuantity, promoPrice;

    public NItemsPromotion(SKU sku, int requiredQuantity, int promoPrice) {
        this.sku = sku;
        this.requiredQuantity = requiredQuantity;
        this.promoPrice = promoPrice;
    }

    @Override
    public boolean isApplicable(Map<SKU, Integer> items) {
        return items.getOrDefault(sku, 0) >= requiredQuantity;
    }

    @Override
    public int apply(Map<SKU, Integer> items) {
        int quantity = items.getOrDefault(sku, 0);
        int promoCount = quantity / requiredQuantity;
        int remainder = quantity % requiredQuantity;
        items.put(sku, 0);
        return (promoCount * promoPrice) + (remainder * sku.getPrice());
    }
    
}

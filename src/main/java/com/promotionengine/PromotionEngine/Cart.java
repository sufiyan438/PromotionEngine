package com.promotionengine.PromotionEngine;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<SKU, Integer> items = new HashMap<>();

    public void addItem(SKU sku, int quantity){
        items.put(sku, items.getOrDefault(sku, 0) + quantity);
    }

    public Map<SKU, Integer> getItems(){
        return items;
    }
    
}

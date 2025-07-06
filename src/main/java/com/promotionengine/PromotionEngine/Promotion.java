package com.promotionengine.PromotionEngine;

import java.util.Map;

public interface Promotion {
    boolean isApplicable(Map<SKU, Integer> items);
    int apply(Map<SKU, Integer> items);
}

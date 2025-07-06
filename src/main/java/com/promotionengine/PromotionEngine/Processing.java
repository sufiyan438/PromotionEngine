package com.promotionengine.PromotionEngine;

public class Processing {
    public void processingAndOutput(Cart cart){
        Constants constants = new Constants();
        PromotionEngine engine = new PromotionEngine();
        engine.addPromotion(new NItemsPromotion(SKU.A, constants.SKU_A_REQUIRED_QUANTITY, constants.SKU_A_PROMO_PRICE));
        engine.addPromotion(new NItemsPromotion(SKU.B, constants.SKU_B_REQUIRED_QUANTITY, constants.SKU_B_PROMO_PRICE));
        engine.addPromotion(new ComboPromotion(SKU.C, SKU.D, constants.COMBO_PRICE_FOR_C_AND_D));
    }
}

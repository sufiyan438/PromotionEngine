package com.promotionengine.PromotionEngine;

public class Processing {
    public void processingAndOutput(Cart cart){
        // Constants constants = new Constants();
        PromotionEngine engine = new PromotionEngine();
        engine.addPromotion(new NItemsPromotion(SKU.A, Constants.SKU_A_REQUIRED_QUANTITY, Constants.SKU_A_PROMO_PRICE));
        engine.addPromotion(new NItemsPromotion(SKU.B, Constants.SKU_B_REQUIRED_QUANTITY, Constants.SKU_B_PROMO_PRICE));
        engine.addPromotion(new ComboPromotion(SKU.C, SKU.D, Constants.COMBO_PRICE_FOR_C_AND_D));

        BillingService billingService = new BillingService();
        int total = billingService.generateBill(cart, engine);
        new OutputPrint().printTotal(total);
    }
}

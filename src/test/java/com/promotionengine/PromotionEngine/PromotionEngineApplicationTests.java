package com.promotionengine.PromotionEngine;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PromotionEngineApplicationTests {

	@Test
	void testApplyfor4As(){
		Map<SKU, Integer> cart = new HashMap<>();
		cart.put(SKU.A, 4);
		NItemsPromotion promo = new NItemsPromotion(SKU.A, 3, 130);
		assertTrue(promo.isApplicable(cart));
		int result = promo.apply(cart);
		assertEquals(180, result);
		assertEquals(0, cart.get(SKU.A));
	}

	@Test
	void testApplyComboCAndD(){
		Map<SKU, Integer> cart = new HashMap<>();
		cart.put(SKU.C, 1);
		cart.put(SKU.D, 1);
		ComboPromotion promo = new ComboPromotion(SKU.C, SKU.D, 30);
		assertTrue(promo.isApplicable(cart));
		int result = promo.apply(cart);
		assertEquals(30, result);
		assertEquals(0, cart.get(SKU.C));
		assertEquals(0, cart.get(SKU.D));
	}
}

package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VendingProductTest {
	
	VendingProduct product;

	@Test
	void testGetDescription(){
		product = new VendingProduct("thingy", null);
		Assert.assertEquals("Not the same", "thingy", product.getDescription());
	}

	@Test
	void testGetPrice(){
		BigDecimal price = new BigDecimal(1.45);
		product = new VendingProduct(null, price);
		Assert.assertEquals("Not the same", price, product.getPrice());
	}

}

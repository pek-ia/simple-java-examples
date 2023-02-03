package com.example;

import java.math.BigDecimal;

public class VendingProduct {
	public VendingProduct(String description, BigDecimal price) {
		super();
		this.description = description;
		this.price = price;
	}
	private String description;
	private BigDecimal price;
	public String getDescription() {
		return description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public String toString() {
		return "VendingProduct [description=" + description + ", price=" + price + "]";
	}
	
}

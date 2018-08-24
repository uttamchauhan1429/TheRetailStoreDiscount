package com.assessment.retaildiscount.models;

import com.assessment.retaildiscount.enums.ItemType;

/**
 * Store item model class
 * @author uttamchauhan
 *
 */
public class Item {

	public Item(String itemName, ItemType itemType, double price) {
		this.itemName = itemName;
		this.itemType = itemType;
		this.price = price;
	}
	
	private String itemName;

	private ItemType itemType;

	private double price;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}

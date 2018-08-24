package com.assessment.retaildiscount.enums;

/**
 * Enum class to define item types
 * @author uttamchauhan
 *
 */
public enum ItemType {

	GROCERIES(false), OTHERS(true);
	
	private ItemType(boolean discount) {
		this.discount = discount;
	}
	
	private boolean discount;

	public boolean isDiscount() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	
}

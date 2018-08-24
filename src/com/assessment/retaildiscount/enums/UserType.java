package com.assessment.retaildiscount.enums;

import com.assessment.retaildiscount.constants.BillConstants;

/**
 * Enum class to define user types
 * @author uttamchauhan
 *
 */
public enum UserType {
	 
	STORE_EMPLOYEE(BillConstants.number.THIRTY), 
	STORE_AFFILIATE(BillConstants.number.TEN), 
	CUSTOMER_OVER_TWO_YEARS(BillConstants.number.FIVE), 
	OTHER(BillConstants.number.ZERO);
	
	private UserType(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	private int discountPercentage;
	
	public int getDiscountPercentage() {
		return discountPercentage;
	}

}

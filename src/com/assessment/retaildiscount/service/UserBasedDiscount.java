package com.assessment.retaildiscount.service;

import com.assessment.retaildiscount.models.Bill;

@FunctionalInterface
public interface UserBasedDiscount {
	
	void calculate(Bill bill);
	
}

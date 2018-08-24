package com.assessment.retaildiscount.service;

import com.assessment.retaildiscount.models.Bill;

@FunctionalInterface
public interface AmountBasedDiscount {
	
	void calculate(Bill bill);
	
}

package com.assessment.retaildiscount.service.impl;

import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.service.AmountBasedDiscount;

public class CentBillDiscountImpl implements AmountBasedDiscount {

	@Override
	public void calculate(Bill bill) {
		double discount = (bill.getNetPayable()/100)*5;
		bill.setNetPayable(bill.getNetPayable()-(discount));	
	}
}

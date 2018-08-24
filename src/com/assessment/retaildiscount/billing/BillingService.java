package com.assessment.retaildiscount.billing;

import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.service.AmountBasedDiscount;
import com.assessment.retaildiscount.service.UserBasedDiscount;

public class BillingService {
	
	public BillingService(Bill bill, AmountBasedDiscount amountBasedDiscount, UserBasedDiscount userBasedDiscount) {
		this.bill=bill;
		this.userBasedDiscount=userBasedDiscount;	
		this.amountBasedDiscount=amountBasedDiscount;
	}
	
	private Bill bill;
	
	private AmountBasedDiscount amountBasedDiscount;
	
	private UserBasedDiscount userBasedDiscount;
	
	public void calculate() {
		userBasedDiscount.calculate(bill);
		amountBasedDiscount.calculate(bill);
	}
}

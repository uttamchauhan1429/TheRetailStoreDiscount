package com.assessment.retaildiscount.service.impl;

import java.util.List;

import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.models.Item;
import com.assessment.retaildiscount.service.AmountBasedDiscount;

public class OthersDiscountImpl implements AmountBasedDiscount {

	@Override
	public void calculate(Bill bill) {
		double totalBill = 0.0;
		List<Item> itemsList = bill.getItemList();
		for(Item item : itemsList) {
			totalBill=totalBill+item.getPrice();
		}
		bill.setNetPayable(totalBill);
		
	}

}

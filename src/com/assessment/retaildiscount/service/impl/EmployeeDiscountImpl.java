package com.assessment.retaildiscount.service.impl;

import java.util.List;

import com.assessment.retaildiscount.enums.ItemType;
import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.models.Item;
import com.assessment.retaildiscount.service.UserBasedDiscount;

public class EmployeeDiscountImpl implements UserBasedDiscount {

	@Override
	public void calculate(Bill bill) {
		double groceriesTotalBill = 0.0;
		double othersTotalBill = 0.0;
		List<Item> itemsList = bill.getItemList();

		for(Item item : itemsList) {
			if(item.getItemType().compareTo(ItemType.GROCERIES)==0) 
				groceriesTotalBill=groceriesTotalBill+item.getPrice();
			else if(item.getItemType().compareTo(ItemType.OTHERS)==0)
				othersTotalBill=othersTotalBill+item.getPrice();
		}
		double totalBill=groceriesTotalBill+othersTotalBill;
		bill.setNetPayable(totalBill-(othersTotalBill*((double)30/100)));
			
	}
}

package com.assessment.retaildiscount.service.impl;

import java.util.List;

import com.assessment.retaildiscount.enums.ItemType;
import com.assessment.retaildiscount.enums.UserType;
import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.models.Item;
import com.assessment.retaildiscount.service.UserBasedDiscount;

public class UserDiscountImpl implements UserBasedDiscount {

	@Override
	public void calculate(Bill bill) {
		double groceriesTotalBill = 0.0;
		double othersTotalBill = 0.0;
		List<Item> itemsList = bill.getItemList();
		for(Item item : itemsList) {
			if(item.getItemType().equals(ItemType.GROCERIES))
				groceriesTotalBill=groceriesTotalBill+item.getPrice();
			else if(item.getItemType().equals(ItemType.OTHERS))
				othersTotalBill=othersTotalBill+item.getPrice();
		}

		if(bill.getUser().getUserType().equals(UserType.CUSTOMER_OVER_TWO_YEARS)) {			
			double totalBill=groceriesTotalBill+othersTotalBill;
			bill.setNetPayable(totalBill-(othersTotalBill*((double)5/100)));
		}
		else {
			bill.setNetPayable(groceriesTotalBill+othersTotalBill);
		}

	}
}

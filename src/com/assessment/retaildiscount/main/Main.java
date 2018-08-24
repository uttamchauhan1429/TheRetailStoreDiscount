package com.assessment.retaildiscount.main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.assessment.retaildiscount.billing.BillingService;
import com.assessment.retaildiscount.enums.ItemType;
import com.assessment.retaildiscount.enums.UserType;
import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.models.Item;
import com.assessment.retaildiscount.models.User;
import com.assessment.retaildiscount.service.impl.AffiliateDiscountImpl;
import com.assessment.retaildiscount.service.impl.CentBillDiscountImpl;
import com.assessment.retaildiscount.service.impl.EmployeeDiscountImpl;
import com.assessment.retaildiscount.service.impl.UserDiscountImpl;

public class Main {

	public static void main(String[] a) {
		User user = new User();
		user.setUserId(Long.parseLong(UUID.randomUUID().toString()));
		user.setUserName("Uttam");
		user.setUserType(UserType.STORE_EMPLOYEE);

		Bill bill=new Bill();
		bill.setUser(user);
		List<Item> itemsList = new ArrayList<Item>();
		itemsList.add(new Item("Toothpaste", ItemType.OTHERS, 10));
		itemsList.add(new Item("Grapes", ItemType.GROCERIES, 100));
		bill.setItemList(itemsList);
		
		switch(bill.getUser().getUserType()) {
		case STORE_EMPLOYEE:
			BillingService billEmp=new BillingService(bill, new CentBillDiscountImpl(), new EmployeeDiscountImpl());
			billEmp.calculate();
			break;
		case CUSTOMER_OVER_TWO_YEARS:
			BillingService billCust=new BillingService(bill, new CentBillDiscountImpl(), new UserDiscountImpl());
			billCust.calculate();
			break;
		case STORE_AFFILIATE:
			BillingService billAff=new BillingService(bill, new CentBillDiscountImpl(), new AffiliateDiscountImpl());
			billAff.calculate();
			break;
		default:
			BillingService billOth=new BillingService(bill, new CentBillDiscountImpl(), new AffiliateDiscountImpl());
			billOth.calculate();
			break;
		}
	}
}

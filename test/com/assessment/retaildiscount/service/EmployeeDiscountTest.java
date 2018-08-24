package com.assessment.retaildiscount.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import com.assessment.retaildiscount.enums.ItemType;
import com.assessment.retaildiscount.enums.UserType;
import com.assessment.retaildiscount.models.Bill;
import com.assessment.retaildiscount.models.Item;
import com.assessment.retaildiscount.models.User;
import com.assessment.retaildiscount.service.impl.EmployeeDiscountImpl;

public class EmployeeDiscountTest {

	@Test
	public void testEmployeeDiscount() {
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
		
		EmployeeDiscountImpl employeeDiscountImpl=new EmployeeDiscountImpl();
		employeeDiscountImpl.calculate(bill);
		assertEquals(90.0 , bill.getNetPayable(), 0.0001);
		
	}
}

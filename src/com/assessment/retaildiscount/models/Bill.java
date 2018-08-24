package com.assessment.retaildiscount.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Billing model class of particular user
 * @author uttamchauhan
 *
 */
public class Bill {
	
	private long billId;
	
	private User user;
	
	private Date date;
	
	private double netPayable;
	
	public double getNetPayable() {
		return netPayable;
	}

	public void setNetPayable(double netPayable) {
		this.netPayable = netPayable;
	}

	private List<Item> itemList = new ArrayList<Item>();

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
}

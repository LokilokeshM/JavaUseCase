package com.srm.rsc.S2JDTPOSReport.Customer;

public class ShoppingItem extends item{

	public int customerid;
	

	public ShoppingItem(int id, String category, String description, int count, int cost, int customerid) {
		super(id, category, description, count, cost);
		this.customerid = customerid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "ShoppingItem [customerid=" + customerid + ", id=" + id + ", category=" + category + ", description="
				+ description + ", count=" + count + ", cost=" + cost + "]";
	}

}

package com.srm.rsc.S2JDTPOSReport.Customer;

public class item extends BaseClass{
	public int id;
	public String category;
	public String description;
	public int count;
	public int cost;

	public item(int id, String category, String description, int count, int cost) {
		super();
		this.id = id;
		this.category = category;
		this.description = description;
		this.count = count;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "item [id=" + id + ", category=" + category + ", description=" + description + ", count=" + count
				+ ", cost=" + cost + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}

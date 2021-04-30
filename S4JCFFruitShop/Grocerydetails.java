package S4JCFFruitShop;

public class Grocerydetails extends Basemodel  {
	String GroceryName;
	String GroceryType;
	String Distributor;
	double GroceryWeight;
	String GroceryCategory;
	String location;
	String expiryDate;
	int quantity;
	double cost;
	double totalcost;
	public Grocerydetails(String groceryName, String groceryType, String distributor, double groceryWeight,
			String groceryCategory, String location, String expiryDate, int quantity, double cost, double totalcost) {
		super();
		GroceryName = groceryName;
		GroceryType = groceryType;
		Distributor = distributor;
		GroceryWeight = groceryWeight;
		GroceryCategory = groceryCategory;
		this.location = location;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.cost = cost;
		this.totalcost = totalcost;
	}
	public double costDetails(String GroceryName)
	{
	switch(GroceryName)
	{
	case "rice":cost=50;
	totalcost=quantity*cost;
	break;
	case "dhal":cost=180;
	totalcost=quantity*cost;
	break;
	case "oil":cost=160;
	totalcost=quantity*cost;
	break;
	case "snacks":cost=50;
	totalcost=quantity*cost;
	break;
	case "beverage":cost=75;
	totalcost=quantity*cost;
	break;
	default:System.out.println("Grocery not available");
	}
	return totalcost;
	}
	@Override
	public String toString() {
		return "Grocerydetails [GroceryName=" + GroceryName + ", GroceryType=" + GroceryType + ", Distributor="
				+ Distributor + ", GroceryWeight=" + GroceryWeight + ", GroceryCategory=" + GroceryCategory
				+ ", location=" + location + ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", cost=" + cost
				+ ", totalcost=" + totalcost + "]";
	}
	
}


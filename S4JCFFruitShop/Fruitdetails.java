package S4JCFFruitShop;

public class Fruitdetails extends Basemodel {
	String fruitName;
	String fruitType;
	String Distributor;
	double fruitWeight;
	String fruitCategory;
	String location;
	String expiryDate;
	int quantity;
	double cost;
	double totalcost;
	

public Fruitdetails(String fruitName, String fruitType, String distributor, double fruitWeight, String fruitCategory,
		String location, String expiryDate, int quantity, double cost, double totalcost) {
	super();
	this.fruitName = fruitName;
	this.fruitType = fruitType;
	this.Distributor = distributor;
	this.fruitWeight = fruitWeight;
	this.fruitCategory = fruitCategory;
	this.location = location;
	this.expiryDate = expiryDate;
	this.quantity = quantity;
	this.cost = cost;
	this.totalcost = totalcost;
}

public double costDetails(String fruitName)
{
switch(fruitName)
{
case "apple":cost=100;
totalcost=quantity*cost;
break;
case "kiwi":cost=100;
totalcost=quantity*cost;
break;
case "orange":cost=100;
totalcost=quantity*cost;
break;
case "muskmelon":cost=100;
totalcost=quantity*cost;
break;
case "custard apple":cost=100;
totalcost=quantity*cost;
break;
default:System.out.println(" fruit not available");
}
return totalcost;
}
@Override
public String toString() {
	return "Fruitdetails [fruitName=" + fruitName + ", fruitType=" + fruitType + ", Distributor=" + Distributor
			+ ", fruitWeight=" + fruitWeight + ", fruitCategory=" + fruitCategory + ", location=" + location
			+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", cost=" + cost + ", totalcost=" + totalcost
			+ "]";
}

}
 
	


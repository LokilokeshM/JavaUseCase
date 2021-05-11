package S4JGerneicsFruitShop;

public class Apple {
	private String fruitName;
	private String fruitType;
	private String distributorName;
	private double fruitWeight;
	private String fruitCategory;
	private String location;
	private String expiryDate;
	private int quantity;
	private double cost;
	private double totalcost;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitType() {
		return fruitType;
	}
	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public double getFruitWeight() {
		return fruitWeight;
	}
	public void setFruitWeight(double fruitWeight) {
		this.fruitWeight = fruitWeight;
	}
	public String getFruitCategory() {
		return fruitCategory;
	}
	public void setFruitCategory(String fruitCategory) {
		this.fruitCategory = fruitCategory;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Apple [fruitName=" + fruitName + ", fruitType=" + fruitType + ", distributorName=" + distributorName
				+ ", fruitWeight=" + fruitWeight + ", fruitCategory=" + fruitCategory + ", location=" + location
				+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", cost=" + cost + ", totalcost="
				+ totalcost + "]";
	}
	public Apple(String fruitName, String fruitType, String distributorName, double fruitWeight, String fruitCategory,
			String location, String expiryDate, int quantity, double cost, double totalcost) {
		super();
		this.fruitName = fruitName;
		this.fruitType = fruitType;
		this.distributorName = distributorName;
		this.fruitWeight = fruitWeight;
		this.fruitCategory = fruitCategory;
		this.location = location;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.cost = cost;
		this.totalcost = totalcost;
	}
	
}


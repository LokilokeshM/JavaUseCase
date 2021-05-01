package S4JCFFruitShop;

import java.util.Comparator;

public class SortByDistAndGrocType implements Comparator<Grocerydetails> {

	
	public int compare(Grocerydetails o1, Grocerydetails o2) {
		if(o1.Distributor.compareTo(o2.Distributor)==0)
		{
			return o1.GroceryType.compareTo(o2.GroceryType);
		}
		else
		{
			return o1.Distributor.compareTo(o2.Distributor);
		}
	}

}

package S4JCFFruitShop;

import java.util.Comparator;

public class SortByCostAndExpiry implements Comparator<Grocerydetails> {

	@Override
	public int compare(Grocerydetails o1, Grocerydetails o2) {
		if(o1.GroceryType.compareTo(o2.GroceryType)==0)
		{
			return o1.expiryDate.compareTo(o2.expiryDate);
		}
		else
		{
			return o1.expiryDate.compareTo(o2.expiryDate);
		}
	}
		
	}



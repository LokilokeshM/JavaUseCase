package S4JCFFruitShop;

import java.util.Comparator;

public class SortByNameAndLocation implements Comparator<Grocerydetails> {

	
	public int compare(Grocerydetails o1, Grocerydetails o2) {
		if(o1.GroceryName.compareTo(o2.GroceryName)==0)
		{
			return o1.location.compareTo(o2.location);
		}
		else
		{
			return o1.GroceryName.compareTo(o2.GroceryName);
		}
	}

		
	}



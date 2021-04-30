package S4JCFFruitShop;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryOperations {
void getDetails(ArrayList al )
{
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
}
void sortByDistAndGroceryType(ArrayList al)
{
	Collections.sort(al,new SortByDistAndGrocType());
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
}
void SortByCostAndExpiry(ArrayList al)
{
	Collections.sort(al,new SortByCostAndExpiry());
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
}
void findByDis(ArrayList<Grocerydetails> al,String distName)
{
	System.out.println("Searched");
	for(Grocerydetails g:al)
	{
		if(g.Distributor.equals(distName))
		{
			System.out.println(g);
		}
	}
}
}


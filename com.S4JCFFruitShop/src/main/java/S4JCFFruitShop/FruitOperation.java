package S4JCFFruitShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitOperation {
	void getDetails(List<Fruitdetails> fd )
	{
		for(int i=0;i<fd.size();i++)
		{
			System.out.println(fd.get(i));
		}
	}
	void findByDis(ArrayList<Fruitdetails> al,String distName)
	{
		
		for(Fruitdetails f:al)
		{
			if(f.Distributor.equals(distName))
			{
				System.out.println(f);
			}
			else
			{
				System.out.println("No Records Found");
			}
		}
		System.out.println("Searched");
	}
	void findByName(ArrayList<Fruitdetails> al,String name) {
		for(Fruitdetails f1:al)
		{
			if(f1.fruitName.equals(name))
			{
				System.out.println(f1);
			}
			else
			{
				System.out.println("No Name Found...");
			}
		}
	}
	void findByloc(ArrayList<Fruitdetails> al,String location)
	{
		for(Fruitdetails f2:al)
		{
			if(f2.location.equals(location))
			{
				System.out.println(f2);
			}
			else
			{
				System.out.println("No Location Found");
			}
		}
	}
}

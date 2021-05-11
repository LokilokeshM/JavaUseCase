package S4JCFFruitShop;

import java.util.ArrayList;
import java.util.Collections;

public class FruitOperation {
	void getDetails(ArrayList al )
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	void findByDis(ArrayList<Fruitdetails> al,String distName)
	{
		System.out.println("Searched");
		for(Fruitdetails f:al)
		{
			if(f.Distributor.equals(distName))
			{
				System.out.println(f);
			}
		}
	}
	void findByName(ArrayList<Fruitdetails> al,String Name )
	{
		System.out.println("Searched");
		for(Fruitdetails f1:al)
		{
			if(f1.fruitName.equals(Name))
			{
				System.out.println(f1);
			}
		}
	}
	void findByloc(ArrayList<Fruitdetails> al,String location)
	{
		System.out.println("Searched");
		for(Fruitdetails f2:al)
		{
			if(f2.location.equals(location))
			{
				System.out.println(f2);
			}
		}
	}
}

package S4JGerneicsFruitShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		String fruitName="";
		String fruitType="";
		String distributorName="";
		double fruitWeight=0;
		String fruitCategory="";
		String location="";
		String expiryDate="";
		int quantity=0;
		double cost=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Fruits Details to Add : ");
		int num=sc.nextInt();
		HashMap<Integer,Envy> h1=new HashMap<Integer, Envy>();
		HashMap<Integer,Fuji> h2=new HashMap<Integer, Fuji>();
		HashMap<Integer,Cameo> h3=new HashMap<Integer, Cameo>();
		AppleCategory AC=new AppleCategory();
		Map m=new HashMap<>();
		for(int i=1;i<=num;i++)
		{	
			sc.nextLine();
			System.out.println("Enter the Fruit Name : ");
			fruitName=sc.nextLine();
			System.out.println("Enter the Fruit Type : ");
			fruitType=sc.nextLine();
			System.out.println("Enter the Distributor Name : ");
			distributorName=sc.nextLine();
			System.out.println("Enter the Fruit Weight : ");
			fruitWeight=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Fruit Category : ");
			fruitCategory=sc.nextLine();
			System.out.println("Enter the Location : ");
			location=sc.nextLine();
			System.out.println("Enter the Expiry Date : ");
			expiryDate=sc.nextLine();
			System.out.println("Enter the Quantity : ");
			quantity=sc.nextInt();	
			System.out.println("Enter the Cost : ");
			cost=sc.nextDouble();
			switch(i)
			{
			case 1:
				h1.put(1,new Envy(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				break;
			case 2:
				h2.put(2,new Fuji(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				break;
			default:
				h3.put(3,new Cameo(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				break;
			}
			new AppleCategory().getdetails(h1);
			new AppleCategory().getdetails(h2);
			new AppleCategory().getdetails(h3);
				
					
			
}
		
}
}


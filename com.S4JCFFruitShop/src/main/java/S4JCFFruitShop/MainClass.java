package S4JCFFruitShop;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		ArrayList<Grocerydetails> gd = new ArrayList<Grocerydetails>();
		ArrayList<Fruitdetails> fd = new ArrayList<Fruitdetails>();	
		out.println("Choose Your Fav Product");
		out.println("1. Fruits");
		out.println("2. Grocery");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("enter the no.of.Fruit details : ");
			n=sc.nextInt();
			for (int i=0;i<n;i++) {
			
			System.out.println("Fruit name");
			
			String fruitName= sc.next();
			System.out.println("Fruit Type");
			String fruitType= sc.next();
			System.out.println("fruit weight");
			double Distributor= sc.nextDouble();
			System.out.println("Distributor name");
			String fruitWeight= sc.next();
			System.out.println("Fruit Category");
			String fruitcategory= sc.next();
			System.out.println("Location");
			String location= sc.next();
			System.out.println("expiryDate");
			String expiryDate= sc.next();
			System.out.println("Quantity");
			int quantity= sc.nextInt();
			System.out.println("Cost");
			double cost= sc.nextDouble();	
			fd.add(new Fruitdetails(fruitName, fruitType, fruitWeight, Distributor, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
			}
		
			FruitOperation fo=new FruitOperation();
			fo.getDetails(fd);
			fo.findByDis(fd,"Loki");
			fo.findByName(fd,"kiwi");
			fo.findByloc(fd,"chennai");
			
			break;
		case 2:
			
			System.out.println("enter the no.of.grocery details : ");
			n=sc.nextInt();
			for (int i=0;i<n;i++) {
				
				System.out.println("enter the Grocery name");
				String GroceryName= sc.next();
				System.out.println("enter the Grocery Type");
				String GroceryType= sc.next();
				System.out.println("enter the Grocery weight");
				double Distributor= sc.nextDouble();
				System.out.println("enter the Distributor name");
				String GroceryWeight= sc.next();
				System.out.println("enter the Grocery category");
				String Grocerycategory= sc.next();
				System.out.println("enter the location");
				String location= sc.next();
				System.out.println("enter the expiryDate");
				String expiryDate= sc.next();
				System.out.println("enter the quantity");
				int quantity= sc.nextInt();
				System.out.println("enter the cost");
				double cost= sc.nextDouble();
				gd.add(new Grocerydetails(GroceryName, GroceryType, GroceryWeight, Distributor, Grocerycategory, location, expiryDate, quantity, cost,quantity*cost));
			}
			GroceryOperations go=new GroceryOperations();
			go.getDetails(gd);
			go.findByDis(gd,"Loki");
			go.sortByDistAndGroceryType(gd);
			go.SortByCostAndExpiry(gd);
			go.findByDis(gd, "d1");
			break;
		default:
			out.println("Please Repeat the Process");
		}
	}

}

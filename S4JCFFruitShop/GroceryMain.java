package S4JCFFruitShop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GroceryMain  {
	public static void main(String[] args) {

		List<Grocerydetails> fd = new ArrayList<Grocerydetails>();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of.grocery details : ");
		int n=sc.nextInt();
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
			fd.add(new Grocerydetails(GroceryName, GroceryType, GroceryWeight, Distributor, Grocerycategory, location, expiryDate, quantity, cost,quantity*cost));
		}
		GroceryOperations go=new GroceryOperations();
		go.getDetails((ArrayList)fd);
		go.findByDis((ArrayList)fd,"kishor");
		go.sortByDistAndGroceryType((ArrayList)fd);
		go.SortByCostAndExpiry((ArrayList)fd);
		
		
	}
	}


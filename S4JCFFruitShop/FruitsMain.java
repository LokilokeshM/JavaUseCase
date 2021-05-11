package S4JCFFruitShop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FruitsMain {

	public static void main(String[] args) {

		List<Fruitdetails> fd = new ArrayList<Fruitdetails>();	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no.of.Fruit details : ");
	int n=sc.nextInt();
	for (int i=0;i<n;i++) {
		
		System.out.println("enter the fruit name");
		
		String fruitName= sc.nextLine();
		System.out.println("enter the fruit Type");
		String fruitType= sc.nextLine();
		System.out.println("enter the fruit weight");
		double Distributor= sc.nextDouble();
		System.out.println("enter the Distributor name");
		String fruitWeight= sc.nextLine();
		System.out.println("enter the fruit category");
		String fruitcategory= sc.nextLine();
		System.out.println("enter the location");
		String location= sc.nextLine();
		System.out.println("enter the expiryDate");
		String expiryDate= sc.next();
		System.out.println("enter the quantity");
		int quantity= sc.nextInt();
		System.out.println("enter the cost");
		double cost= sc.nextDouble();
		
		fd.add(new Fruitdetails(fruitName, fruitType, fruitWeight, Distributor, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
	}
	
	FruitOperation fo=new FruitOperation();
	fo.getDetails((ArrayList<Fruitdetails>)fd);
	fo.findByDis((ArrayList<Fruitdetails>)fd,"kishor");
	fo.findByName((ArrayList<Fruitdetails>)fd,"kiwi");
	fo.findByloc((ArrayList<Fruitdetails>)fd,"chennai");
	}

}

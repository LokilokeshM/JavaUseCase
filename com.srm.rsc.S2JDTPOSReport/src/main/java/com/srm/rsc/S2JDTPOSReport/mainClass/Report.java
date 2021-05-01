package com.srm.rsc.S2JDTPOSReport.mainClass;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.srm.rsc.S2JDTPOSReport.Customer.item;

public class Report {
	public static void main(String[] args) {
		String category,description;
		int count,cost;
		Scanner sc  = new Scanner(System.in);	
		out.println("Enter Your Customer Id");
		int cid = sc.nextInt();
		List<item> itemList = new ArrayList<item>(); 
		out.println("Enter The Item to be Added in your List:");
		int n = sc.nextInt();
		
		for(int i= 0; i< n ;i++)
		{
			out.println("Enter the Category");
			category = sc.next();
			out.println("Enter the Description:");
			description = sc.next();
			out.println("Enter The Count");
			count= sc.nextInt();
			out.println("Enter The Cost");
			cost= sc.nextInt();
			
			itemList.add(new item(i+1, category, description, count, cost));
		}
		ReportOperations ro = new ReportOperations();
		
		ro.Display(itemList, cid);
		
	}	
}
	 
	

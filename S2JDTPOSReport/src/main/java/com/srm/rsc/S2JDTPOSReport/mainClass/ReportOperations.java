package com.srm.rsc.S2JDTPOSReport.mainClass;

import java.util.Date;
import java.util.List;
import static java.lang.System.out;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.srm.rsc.S2JDTPOSReport.Customer.item;

public class ReportOperations {
	public int Total(int cost, int count)
	{
		int total = cost * count;
		return total;
	}
	
	public void Display(List<item> itemlist , int custid)
	{	
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		int total =0;
		out.println("---------------------------------------------------");
		out.println("\t\t\t\t E Mart ");
		out.println("\t\t\t 123 Avenue CA Districe ");
		out.println("----------------------------------------------------");
		out.println("Customerid : \t" + custid);
		out.println("Date:\t" + dtf.format(now));
		
		out.println("-----------------------------------------------------");
		out.println("Id \tCategory\tDescription\tCount\tcost");
		for(item i:itemlist)
		{
			out.println(i.getId()+"\t"+i.getCategory()+"\t\t"+i.getDescription()+"\t\t"+i.getCount()+
					"\t\t"+i.getCost());
			total = total + Total(i.getCost(), i.getCount());
		}
		out.println("------------------------------------------------------");
		out.println("\t\t\t\t\t--------------");
		out.println("\t\t\t\t\t Total \t\t" +total);
		float gst= (float) (0.12 * total);
		out.println("\t\t\t\t\t-----------------");
		out.println("\t\t\t\t\t S GST(6%) "+gst /2);
		out.println("\t\t\t\t\t-----------------");
		out.println("\t\t\t\t\t C GST(6%) "+gst /2);
		out.println("\t\t\t\t\t----------------");
		out.println("");
		out.println("\t\t\t\t\t----------------");
		out.println("\t\t\t\t Grand Total: " +(total + gst));
		out.println("\t\t\t\t\t----------------");
		
	}
}

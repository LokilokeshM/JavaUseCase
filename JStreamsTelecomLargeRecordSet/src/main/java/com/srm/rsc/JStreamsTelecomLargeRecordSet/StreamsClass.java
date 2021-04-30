package com.srm.rsc.JStreamsTelecomLargeRecordSet;

import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsClass {

	
	public void getFirstTenRecords(List<Customer> cust,int n)
	{
		for(int i= 0; i <  n ;i++)
		{
			System.out.println(cust.get(i));
		}
		
	}

	public void SearchByCountry(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Tanzania") && c.description.equals("Postpaid") && c.vas.equals("no"))
        .collect(Collectors.toSet())
        .forEach(System.out::println);
	}
	
	public void SearchByCountryCon(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("South Africa") && c.description.equals("Prepaid") && c.isActive == true)
		.map(c->c)
		.forEach(System.out::println);
	}
	
	public void SortByBaseNumber(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Uganda") && c.phoneNumber.startsWith(c.phoneNumber, 61) && c.is4g.equals("yes"))
		.map(c->c)
		.forEach(System.out::println);
	}
	
	public void SearchByCustNameAndPhoneNumber(ArrayList<Customer> cust, String custName ,String phonenumber)
	{
		cust.stream().filter(c-> c.customerName.equals(custName) && c.phoneNumber.equals(phonenumber))
		.map(c->c)
		.forEach(System.out::println);
	}
	public void PrintByCustomerId(ArrayList<Customer> cust , String custid)
	{
		List l = cust.stream().filter(c-> c.customerId.equals(custid))
				.collect(Collectors.toList());
		if(l.isEmpty())
		{
			System.out.println("No Record Found");
		}
		else
		{
			System.out.println(l);
		}
		
	}
	public void SortByBaseNumber2(ArrayList<Customer> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Nigeria") && c.phoneNumber.startsWith(c.phoneNumber, 56))
		.map(c -> c.customerName.toUpperCase())
		.forEach(System.out::println);
	}
	
	
}

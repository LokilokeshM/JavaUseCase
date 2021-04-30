package com.srm.rsc.JStreamsTelecomLargeRecordSet;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JStreams {
	
	public static void main(String[] args) {
		StreamsClass s = new StreamsClass();
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> custList = new ArrayList<Customer>();	
		custList.add(new Customer(1, "c1", "South Africa", "No.203", "9952017622", "10%", "yes", 1400, "Prepaid", "yes", true));
		custList.add(new Customer(2, "c2", "South Africa", "No.203", "9952017621", "10%", "yes", 1400, "Postpaid", "yes", true));
		custList.add(new Customer(3, "c3", "Tanzania", "No.203", "6152017623", "10%", "yes", 1400, "Postpaid", "no", false));
		custList.add(new Customer(4, "c4", "Tanzania", "No.203", "6152017624", "10%", "yes", 1400, "Prepaid", "yes", true));
		custList.add(new Customer(5, "c5", "South Africa", "No.203", "9952017625", "10%", "yes", 1400, "Postpaid", "yes", false));
		custList.add(new Customer(6, "c6", "South Africa", "No.203", "9952017626", "10%", "yes", 1400, "Prepaid", "yes", true));
		custList.add(new Customer(7, "c7", "Uganda", "No.203", "9952017627", "10%", "yes", 1400, "Postpaid", "no", false));
		custList.add(new Customer(8, "c8", "South Africa", "No.203", "9952017628", "10%", "yes", 1400, "Prepaid", "no", true));
		custList.add(new Customer(9, "c9", "South Africa", "No.203", "9952017629", "10%", "yes", 1400, "Postpaid", "no", false));
		custList.add(new Customer(10, "c20", "Tanzania", "No.203", "9952017610", "10%", "yes", 1400, "Prepaid", "no", true));
		custList.add(new Customer(11, "c11", "Uganda", "No.203", "6152017611", "10%", "yes", 1400, "Postpaid", "yes", false));
		custList.add(new Customer(12, "c123", "Uganda", "No.203", "9952017612", "10%", "yes", 1400, "Prepaid", "yes", true));
		custList.add(new Customer(13, "c22", "South Africa", "No.203", "9952017613", "10%", "yes", 1400, "Postpaid", "yes", false));
		
		out.println("Enter How Many Records you Need To print");
		int n = sc.nextInt();
		if(n >= 10)
		{
			out.println("Printing Minimal Amount of data");
			s.getFirstTenRecords(custList, 10);
		}
		else
		{
			out.println("Display The Data");
			s.getFirstTenRecords(custList, n);
		}
		
		String custName ;
		String phoneNumber;
		String custid;
		out.println("Enter The Customer Name");
		custName = sc.next();
		out.println("Enter The Customer Phone Number");
		phoneNumber = sc.next();
		out.println("Enter The Customer id");
		custid= sc.next();
		
		out.println("Sort By Customer Country");
		s.SearchByCountry(custList);
		out.println("Sort By Customer Code");
		s.SearchByCountryCon(custList);
		out.println("Sort By Name And Phone Number");
		s.SearchByCustNameAndPhoneNumber(custList, custName, phoneNumber);
		out.println("Sort By Base Number");
		s.SortByBaseNumber(custList);
		out.println("Convert All Name to Uppercase");
		s.SortByBaseNumber2(custList);
		
	}

}

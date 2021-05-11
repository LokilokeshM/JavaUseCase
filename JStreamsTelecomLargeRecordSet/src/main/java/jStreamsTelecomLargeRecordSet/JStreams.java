package jStreamsTelecomLargeRecordSet;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class JStreams {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> custList = new ArrayList<Customer>();	
		custList.add(new Customer(1, "c1", "southAfrica", "No.203", "9952017622", "10%", "yes", 1400, "prepaid", "yes", true));
		custList.add(new Customer(2, "c2", "southAfrica", "No.201", "9952017621", "10%", "yes", 1400, "postpaid", "yes", true));
		custList.add(new Customer(3, "c3", "Tanzania", "No.202", "461687431", "10%", "yes", 1400, "postpaid", "no", false));
		
		custList.add(new Customer(5, "c5", "southAfrica", "No.204", "9952017625", "10%", "yes", 1400, "postpaid", "yes", false));
		custList.add(new Customer(6, "c6", "southAfrica", "No.205", "9952017626", "10%", "yes", 1400, "prepaid", "yes", true));
		custList.add(new Customer(7, "c7", "uganda", "No.208", "9952017627", "10%", "yes", 1400, "postpaid", "no", false));
		custList.add(new Customer(8, "c8", "southAfrica", "No.206", "9952017628", "10%", "yes", 1400, "prepaid", "no", true));
		custList.add(new Customer(9, "c9", "southAfrica", "No.207", "9952017629", "10%", "yes", 1400, "postpaid", "no", false));
		custList.add(new Customer(11, "c11", "Uganda", "No.209", "6152017611", "10%", "yes", 1400, "postpaid", "yes", false));
		custList.add(new Customer(12, "c123", "Uganda", "No.220", "9952017612", "10%", "yes", 1400, "prepaid", "yes", true));
		custList.add(new Customer(13, "c22", "southAfrica", "No.241", "9952017613", "10%", "yes", 1400, "postpaid", "yes", false));
		
		out.println("Enter How Many Records you Need To print");
		int n = sc.nextInt();
		if(n >= 10)
		{
			out.println("Printing Minimal Amount of data");
			new StreamsClass().getFirstTenRecords(custList, 10);
		}
		else
		{
			out.println("Display The Data");
			new StreamsClass().getFirstTenRecords(custList, n);
		}
		
		String custName ;
		String phoneNumber;
		out.print("Enter The Customer Name");
		custName = sc.next();
		out.println("Enter The Customer Phone Number");
		phoneNumber = sc.next();
		out.println("Enter The Customer id");
		out.println("Sort By Customer Country");
		new StreamsClass().SearchByCountry(custList);
		out.println("Sort By Customer Code");
		new StreamsClass().SearchByCountryCon(custList);
		out.println("Sort By Name And Phone Number");
		new StreamsClass().SearchByCustNameAndPhoneNumber(custList, custName, phoneNumber);
		out.println("Sort By Base Number");
		new StreamsClass().SortByBaseNumber(custList);
		out.println("Convert All Name to Uppercase");
		new StreamsClass().SortByBaseNumber2(custList);
		
	}

}

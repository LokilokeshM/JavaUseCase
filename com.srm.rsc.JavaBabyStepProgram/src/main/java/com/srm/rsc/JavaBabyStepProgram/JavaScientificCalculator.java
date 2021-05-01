package com.srm.rsc.JavaBabyStepProgram;
import static java.lang.System.out;

import java.util.Scanner;
public class JavaScientificCalculator extends BaseClass{
	
		
	public static void main(String[] args) {	
		JavaScientificCalculator obj = new JavaScientificCalculator();
		out.println("Welcome To Java Scientific Calculator");		
		Scanner sc = new Scanner(System.in);		
		out.println("Choose Your Own Operations To Perform Your Calculations");
		out.println("1. Add \n");
		out.println("2. Divide \n");
		out.println("3. Square Root \n");
		out.println("4. CubeRoot \n");
		out.println("5. Tan \n");
		out.println("6. cos \n");
		out.println("Enter the Number");
		int ch = sc.nextInt();
		int a , b;
		float c;
		double d;
		switch(ch)
		{
		case 1:
			out.println("Enter The value of A");
			a=sc.nextInt();
			out.println("Enter the Value of B");
			b=sc.nextInt();
			out.println("Addition Value =>");
			out.println(obj.add(a, b));
			break;
		case 2:
			out.println("Enter the Value of A");
			a=sc.nextInt();
			out.println("Enter the Value of B");
			b=sc.nextInt();
			out.println("Divition Value =>");
			out.println(obj.divide(a, b));
			break;
		case 3:
			out.println("Enter the Vaue For the Square Root");
			 c = sc.nextFloat();
			 out.println("Square ");
			out.println(obj.squareroot(c));
			break;
		case 4:
			c = sc.nextFloat();
			out.println("");
			out.println(obj.cuberoot(c));
			break;
		case 5:
			out.println("");
			d= sc.nextDouble();
			out.println("");
			out.println(obj.tan(d));
			break;
		case 6:
			out.println("");
			d= sc.nextDouble();
			out.println("");
			out.println(obj.cos(d));
			break;
		default:
			out.println("Choose the Correct Number");
		}
		
	}

}

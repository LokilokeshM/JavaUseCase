package com.srm.java_basic_01;

public class Swapnumbers {

	public static void main(String[] args)  {

        int first = 10;
		float second = 20;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

     
        float temporary = first;

      
        first = (int) second;

       
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
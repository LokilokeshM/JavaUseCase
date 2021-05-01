package com.srm.java_basic_01;

public class Factorial {
	   public static void main(String[] args) {
	        int num = 10;
	        long factorial = multiplyNumbers(num);
	        System.out.println("Factorial of " + num + " = " + factorial);
	    }
	    public static long multiplyNumbers(int num)
	    {
	        if (num >= 1)
	            return num * multiplyNumbers(num - 1);
	        else
	            return 1;
	    }
	}



/* public static void main(String[] args) {

int num = 10;
long factorial = 1;
for(int i = 1; i <= num; ++i)
{
    // factorial = factorial * i;
    factorial *= i;
}
System.out.printf("Factorial of %d = %d", num, factorial);
}
}*/
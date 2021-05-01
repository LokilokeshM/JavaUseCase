package basic_02;

public class ReverseArray {
	public static void main(String[] args)
	{
		int ar[]= {40,23,45,12,67,34,21,35,67};
		for(int p=0;p<ar.length;p++)
		{
			System.out.println(ar[p]);
		}
		System.out.println("Reversed Array");
		for(int p=ar.length-1;p>=0;p--)
		{
			System.out.println(ar[p]);
		}
	}

}



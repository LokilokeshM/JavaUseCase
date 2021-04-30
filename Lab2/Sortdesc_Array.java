package basic_02;

import java.util.ArrayList;
import java.util.Collections;

public class Sortdesc_Array {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		   al.add("kishor");
		   al.add("ziva");
		   al.add("niranjan");
		   al.add("abi");
		   System.out.println("Before Sorting:");
		   for(String str: al){
				System.out.println(str);
			}
		   Collections.sort(al, Collections.reverseOrder());
		   System.out.println("descending order:");
		   for(String str: al){
				System.out.println(str);
			}
		
	}

}



package basic_02;

import java.util.HashSet;
import java.util.Iterator;

public class iterate_hashmap {
	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<String>();
		  
        
        h.add("kishor");
        h.add("mca");
        h.add("srm");
  
        
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
	     }
	

}


package basic_02;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Con_linked_array {
	 public static void main(String[] args) {
	      LinkedList<String> l = new LinkedList<String>();
	      l.add("Orange");
	      l.add("Apple");
	      l.add("Peach");
	      l.add("Guava");
	      l.add("Pear");
	      List<String> aList = new ArrayList<String>(l);
	      System.out.println("The ArrayList elements are: ");
	    for (Object i : aList) {
	         System.out.println(i);
	      }
	   }
	}


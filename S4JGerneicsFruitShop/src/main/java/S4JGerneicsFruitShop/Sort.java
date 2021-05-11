package S4JGerneicsFruitShop;

import java.util.Comparator;

public class Sort implements Comparator<Apple>{

	public int compare(Apple o1, Apple o2) {
		
		return o1.getFruitCategory().compareTo(o2.getFruitCategory());
	}

}

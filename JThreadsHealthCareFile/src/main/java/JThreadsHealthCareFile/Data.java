package JThreadsHealthCareFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

	
	public List<Header> head()
	{
		List<Header> h = new ArrayList<Header>();
	
		h.add(new Header(new Date(), "UK", "Chars", "300", "001"));
		return h;
	}
	public List<Content> content()
	{
		List<Content> c = new ArrayList<Content>();
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		c.add(new Content(1, "UKSUSEX0010162434343342211", "4.56", "2.56", "5.56", "9.56", "5.67", "2.4", 45));
		return c;
	}
	
}

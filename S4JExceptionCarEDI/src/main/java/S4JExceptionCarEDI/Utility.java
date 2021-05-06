package S4JExceptionCarEDI;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utility extends MyFileReaderImpl{

	public void AddData() throws IOException
	{
		Date dt = new Date();
//		Header h = new Header(dt, null, 0, null, 0);
//		Content c = new Content(null, null, dt, null, null, null, null);
		
		List<Header> h = new ArrayList<Header>();
		List<Content> c = new ArrayList<Content>();
		
		h.add(new Header(dt, "FrontShieldGlass", 1234, "2022020YCarSheild001212121", 123));
		
		c.add(new Content("FrontShieldGlass", "123454", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "12345458", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
		c.add(new Content("FrontShieldGlass", "1234545890987654545", dt, "12022020YCarSheild001212121", "y", "red",(float) 123.0));
	
		writeFile(h , c);
	
	}
	
}

package S4JExceptionCarEDI;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {

	public static boolean ValidateTheFile(String txt) throws IOException
	{
		  FileInputStream fis = new FileInputStream(txt);
	      FileDescriptor fd = null;
	      boolean bool = false;  
	      try {  
	         fd = fis.getFD();
	         
	         // tests file descriptor object's validity
	         bool = fd.valid();
	       
	        
	      } catch(Exception e) {
	         // if any error occurs
	         e.printStackTrace();
	      } finally {
	         // releases systems resources
	         if(fis!=null)
	            fis.close();   
	      }
		return bool;
			
	}
	
}

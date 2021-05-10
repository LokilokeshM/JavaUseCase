package JThreadsHealthCareFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CommonFunction {
	static String txt="";
	static void CreateNewFile()
	{
		try {
		      File myObj = new File("file.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        
		      } else {
		        System.out.println("File already exists.");
		        readFileIntoList();
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	public static List<String> readFileIntoList() 
	{ 
		BufferedReader bufReader;
		ArrayList<String> listOfLines = new ArrayList<String>(); 
		try {
			File file = new File("file.txt");
			FileReader reader = new FileReader(file);
			 txt = file.getName();
			if(ValidateTheFile(txt) !=false)
			{
				bufReader = new BufferedReader(reader);				
				String line = bufReader.readLine(); 	
				while (line != null)
				{ 	
		
					listOfLines.add(line); 
					line = bufReader.readLine();	
				}		
				bufReader.close();
			}
			else
			{
				listOfLines.add(null);
			}			
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return listOfLines;	
	}
	
	public static void SplitData() throws IOException
	{
		List<String> l = new ArrayList<String>();
		l.addAll(readFileIntoList());
		
		for(String s:l)
		{
			String[] obj = s.split("----");
			for(int i=0;i<obj.length ; i++)
			{
				if(obj[i]!=null)
				{
					System.out.println(obj[i]);
				}
			}
			
		}
		
	}
	
	public static void ConvertTxtToCsv(String s) throws IOException
	{
		String[] val =s.split(".");
	    final Path path = Paths.get("path", "to", "folder");
	    final Path txt1 = path.resolve(s);
	    final Path csv = path.resolve(val[0]+".csv");
	    try (
	    final Stream<String> lines = Files.lines(txt1);
	    final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, StandardOpenOption.CREATE_NEW))) 
	    {
	        	lines.map((line) -> line.split("\\|")).
	                map((line) -> Stream.of(line).collect(Collectors.joining(","))).
	                forEach(pw::println);
	    }
	}
	static boolean ValidateTheFile(String txt) throws IOException
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
	public void writeFile(List<Header> h ,List<Content> c) throws IOException
	{
//		FileWriter writer = new FileWriter("file.txt"); 
//		int i=0;
//		for(Header hd: h) {
//		
//			writer.write("----"+hd.getDateTime()+"----"+hd.getFileSequence()+"----"
//			+hd.getManufacturerName()+"----"
//			+hd.getNumberofRecords()+"----"
//			+hd.getTotal()+"----"+System.lineSeparator());
//		}
//		for(Content cn:c)
//		{
//			writer.write(i+1 +"----"
//					+cn.getModelNumber() +"----"
//					+cn.getSKU()+"----"
//					+cn.getModelNumber()+"----"
//					+cn.getColor()+"----"
//					+cn.getCostStep()+"----"+System.lineSeparator());
//		}
//		writer.close();
	}
	public void display() throws IOException
	{
		ArrayList<String> list = new ArrayList<String>();
		int count=0;
		list.addAll(readFileIntoList());
		if(list.isEmpty())
		{
			System.out.println("No Records Found");
		}
		else
		{
			for(String l:list)
			{ 
				System.out.println(l);
				count++;
			}
			System.out.println(count);
			ConvertTxtToCsv("file.txt");
		}
	}	
}

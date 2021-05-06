package S4JExceptionCarEDI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFileReaderImpl extends MyFileReader{
	static String txt="";
	static void CreateNewFile()
	{
		try {
		      File myObj = new File("file.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        new Utility().AddData();
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
	public static void ConvertTxtToCsv() throws IOException
	{
		String[] val =txt.split(".");
	    final Path path = Paths.get("path", "to", "folder");
	    final Path txt1 = path.resolve(txt);
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
	public void writeFile(List<Header> h ,List<Content> c) throws IOException
	{
		FileWriter writer = new FileWriter("file.txt"); 
		int i=0;
		for(Header hd: h) {
		
			writer.write("****"+hd.getDateTime()+"****"+hd.getFileSequence()+"*******"
			+hd.getManufacturerName()+"****"
			+hd.getNumberofRecords()+"****"
			+hd.getTotal()+"****"+System.lineSeparator());
		}
		for(Content cn:c)
		{
			writer.write(i+1 +"****"
					+cn.getModelNumber() +"****"
					+cn.getSKU()+"****"
					+cn.getModelNumber()+"****"
					+cn.getColor()+"****"
					+cn.getCostStep()+"****"+System.lineSeparator());
		}
		writer.close();
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
			ConvertTxtToCsv();
		}
		
		
	}
	
//	public static List<String> readFileIntoList1(String txt) {
//		List<String> lines = Collections.emptyList();
//		try {
//			if(ValidateTheFile(txt) !=false)
//			{
//				lines = Files.readAllLines(Paths.get(txt), StandardCharsets.UTF_8);
//			}
//			else
//			{
//				lines.add("Empty");
//			}
//			 	
//		}
//		catch (IOException e)
//		{ 
//			e.printStackTrace(); 
//		} 
//		return lines; 
//		}			
}

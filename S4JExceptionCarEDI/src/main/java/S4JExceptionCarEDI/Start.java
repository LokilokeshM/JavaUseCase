package S4JExceptionCarEDI;

import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {

		
		System.out.println("Create the File");
		new MyFileReaderImpl().CreateNewFile();
		
		
		System.out.println("It Will Display All Records");
	    new MyFileReaderImpl().display();
		
		
	}

}

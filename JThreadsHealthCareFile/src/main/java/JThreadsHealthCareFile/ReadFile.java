package JThreadsHealthCareFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
	private List processInputFile(String inputFilePath) throws FileNotFoundException {

	    List inputList = new ArrayList();

	    try{

	      File inputF = new File(inputFilePath);
	      InputStream inputFS = new FileInputStream(inputF);
	      BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

	      inputList = br.lines().skip(1).map(null).collect(Collectors.toList());
	      br.close();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }

	    return inputList ;
	}
}

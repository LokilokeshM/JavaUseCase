package JThreadsHealthCareFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class WriterThread implements Runnable{
	 protected BlockingQueue<String> blockingQueue = null;

	  public WriterThread(BlockingQueue<String> blockingQueue){
	    this.blockingQueue = blockingQueue;     
	  }
//	  public void writeFile(List<Header> h ,List<Content> c) throws IOException
//		{
//			FileWriter writer = new FileWriter("file.txt"); 
//			int i=0;
//			for(Header hd: h) {
//			
//				writer.write("****"+hd.getDateTime()+"****"+hd.getFileSequence()+"*******"
//				+hd.getNumberofRecords()+"****"
//				+hd.getRegion()+"****"
//				+System.lineSeparator());
//			}
//			for(Content cn:c)
//			{
//				writer.write(i+1 +"****"
//						+cn.getcHLRatio() +"****"
//						+cn.getlCDLevel()+"****"
//						+cn.getLipidprofile()+"****"
//						+cn.getPatientRefNumber()+"****"
//						+cn.getAge()+"****"+System.lineSeparator());
//			}
//			writer.close();
//		}
	  public void run() {
	    PrintWriter writer = null;
	    
	    try {
	    	List<Header> h = new Data().head();
	    	List<Content> c = new Data().content();
	    	
	    	
	        writer = new PrintWriter(new File("file.txt"));
	        int i=0;
			for(Header hd: h) {
			
				writer.write("****"+hd.getDateTime()+"****"+hd.getFileSequence()+"*******"
				+hd.getNumberofRecords()+"****"
				+hd.getRegion()+"****"
				+System.lineSeparator());
			}
			for(Content cn:c)
			{
				writer.write(i+1 +"****"
						+cn.getcHLRatio() +"****"
						+cn.getlCDLevel()+"****"
						+cn.getLipidprofile()+"****"
						+cn.getPatientRefNumber()+"****"
						+cn.getAge()+"****"+System.lineSeparator());
			}
	        while(true){
	            String buffer = blockingQueue.take();
	            //Check whether end of file has been reached
	            if(buffer.equals("EOF")){ 
	                break;
	            }
	            writer.println(buffer);
	        }               


	    } catch (FileNotFoundException e) {

	        e.printStackTrace();
	    } catch(InterruptedException e){

	    }finally{
	        writer.close();
	    } 

	  }

}

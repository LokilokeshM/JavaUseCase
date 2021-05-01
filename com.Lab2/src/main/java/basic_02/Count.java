package basic_02;

public class Count {
	  public static int
      countWords(String str)
    {
         
       if (str == null || str.isEmpty())
            return 0;
         String[] words = str.split("\\s+");
         return words.length;
    }
     
   
    public static void main(String args[])
    {
           String str =
          "kishorkumar loki srinath ";
       
             System.out.println("No of words : " +
           countWords(str));
    }
}



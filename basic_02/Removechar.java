package basic_02;

public class Removechar {
	   public static void main(String[] args) {  
           String str = "kishorkumar";  
           System.out.println(charRemoveAt(str, 7));  
        }  
        public static String charRemoveAt(String str, int p) {  
           return str.substring(0, p) + str.substring(p + 1);  
        }  
}  



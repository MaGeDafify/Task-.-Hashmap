
import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		
		HashMap<Integer,String> Library = new HashMap<Integer,String>();
		
		Library.put(1,"Java Script");  
		Library.put(2, "C ++");  
		Library.put(3, " Data Base");  
		Library.put(4, " Python"); 
		Library.put(5, " Data Communication and Networking"); 
		Library.put(6, " Web Develop "); 
		//Remove value For Key 4
		   System.out.println("Values before remove: "+ Library);    
		    
		   Library.remove(4);  
		   System.out.println("Values after remove: "+ Library);  
	}
}

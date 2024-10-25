import java.util.*;

public class Main {
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String n = sc.next();
	    
	    String res = "";
	    
	    res = poliomino(n);
	    
	    System.out.println(res);
	    
	}
	    
	    
	    private static String poliomino(String n){
	        
	        String n2 = "";
	        String A = "AAAA", B = "BB";
	        
	        n = n.replace("XXXX",A);
            n2 = n.replace("XX",B);
            
            if(n2.contains("X")){
                n2 = "-1";
            }
            
	    
            
            return n2;

    }

}
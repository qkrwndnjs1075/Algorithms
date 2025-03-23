import java.util.*;
import java.io.*;

public class Main
{
    static int W,H,X,Y,P, player = 0;
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
	    int N = Integer.parseInt(br.readLine());
	    
	    int ans = 0;
	    
	    if(N<4){
	        ans = 0;
	    }else{
	        
	        ans = (N*(N-1) * (N-2) * (N-3) /24);
	        
	    }
	    
	    System.out.println(ans);
	    
	    
		    
		    
		}
}


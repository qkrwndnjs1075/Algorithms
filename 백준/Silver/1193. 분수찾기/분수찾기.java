import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    
	   int cross_count = 1;
	   int count_sum = 0;
	    
	    while(true){
	        
	        if(N <= cross_count + count_sum){
	        
	        if(cross_count % 2 ==1){
	            
	            System.out.print(cross_count - (N - count_sum - 1) + "/" + (N - count_sum ));
	            break;
	        }else{
	            System.out.print((N - count_sum) + "/" +(cross_count- (N - count_sum - 1)));
	            break;
	        }
	        
	   
	 
	    }else{
	        count_sum += cross_count;
	        cross_count++;
	        
	    }
	
	}
}
}

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N+1];
		int[] answer = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++){
		    
		    
		    
		    arr[i] = Integer.parseInt(st.nextToken());
		    
		}
		
		for(int i=1; i<=N; i++){
		    
		    int j=1;
		    
		    while(true){
		        if(arr[i] == 0 && answer[j] ==0){
		            answer[j] = i;
		            break;
		            
		        }else if(answer[j] == 0 ){
		            
		            arr[i]--;
		      
		        }
		        j++;
		        
		        
		    }
		    
		}
		
		for(int i = 1; i<=N; i++){
		    System.out.print(answer[i] + " ");
		}
		
		
		
		
		
		
	}
}

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int total = Integer.parseInt(br.readLine());
		int[] switchs = new int[total];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<total; i++){
		    
		    switchs[i] = Integer.parseInt(st.nextToken());
		}
		
		int stuCnt = Integer.parseInt(br.readLine());
		for(int i = 0; i<stuCnt; i++){
		    
		    st = new StringTokenizer(br.readLine());
		    
		    int gender = Integer.parseInt(st.nextToken());
		    int number = Integer.parseInt(st.nextToken());
		    
		    if(gender == 1){
		        
		        for(int j=0; j<total; j++){
		            
		            if((j+1) % number == 0){
		                
		                switchs[j] = switchs[j] == 0? 1 : 0;
		            }
		        }
		        
		    }else{
		        
		        switchs[number - 1] = switchs[number - 1] == 0 ? 1 : 0;
		        for(int j = 1; j< total/2; j++){
		            
		            if(number - 1 + j >= total || number - 1 -j <0){
		                break;
		            }
		            
		            if(switchs[number - 1 - j] == switchs[number -1 +j]){
		                
		                switchs[number -1 -j] = switchs[number -1 -j] == 0 ? 1 : 0;
		                switchs[number -1 +j] = switchs[number -1 +j] == 0 ? 1 : 0;
		                
		            }else break;
		        }
		    }
		    
		}
		for(int i =0; i<total; i++){
		        System.out.print(switchs[i] + " ");
		        if((i+1)%20 == 0)
		            System.out.println();
		        
		    }
		
		
	
   
    br.close();
	}
}

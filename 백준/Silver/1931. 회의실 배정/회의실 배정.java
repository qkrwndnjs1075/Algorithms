import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	    int N = in.nextInt(); 
	    
	    int[][] time = new int[N][2];
	    
	    
	    
	    for(int i = 0; i < N; i++){
	        time [i][0] = in.nextInt(); // 시작
	        time [i][1] = in.nextInt(); // 종료 
	    }
	    
	    Arrays.sort(time, new Comparator<int[]>(){
	        
	        
	       @Override
	       public int compare(int[] a1, int[] a2){
	        
	        if(a1[1] == a2[1] ){
	            return a1[0] - a2[0];
	        }
	        
	        return a1[1] - a2[1];
	    }
	    
	    });
	    
	    int count = 0;
	    int prev_end_time = 0;
	    
	    for(int i=0; i<N; i++){
	        
	        
	        if(prev_end_time <= time[i][0]){
	            prev_end_time = time[i][1];
	            count++;
	        }
	        
	    }
	    
	    System.out.println(count);
		
		
		
	}
}


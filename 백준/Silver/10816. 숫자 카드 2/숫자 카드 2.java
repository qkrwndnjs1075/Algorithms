import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int[] arr = new int[N];
	    
	    for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++){
		    int key = sc.nextInt();
		    
		    sb.append(Upper(arr, key) - Lower(arr,key)).append(' ');
		    
		}
		    System.out.println(sb);
		
		
	}
	
	public static int Upper(int[] arr, int key){ 
	                                             
	    int left = 0;                            
	    int right = arr.length;
	    
	    while(right > left){
	        
	        int mid = (left + right) / 2; // 6 3 2 10 10 10 -10 -10
	        
	        if(key < arr[mid]){
	            right = mid;
	        }
	        else{
	            left = mid+1;
	        }
	                                            
	    }   
	    return left;
	    
	}
	
	public static int Lower(int[] arr, int key){ 
	                                             
	    int left = 0;                           
	    int right = arr.length;
	    
	    while(right>left){
	        
	        int mid = (left + right) / 2;
	        
	        if(key <= arr[mid]){
	            right = mid;
	        }
	        else{
	            left = mid + 1;
	        }
	        
	    }
	    
	    return left;
	}
	    
}

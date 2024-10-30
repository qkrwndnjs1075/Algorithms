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
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++){
		   
		    if(BinarySearch(arr,sc.nextInt()) >= 0){
		        sb.append(1).append("\n");
		    }else{
		        sb.append(0).append("\n");
		    }
		    
		}
		System.out.println(sb);
		
	}


public static int BinarySearch(int[] arr, int key){
		     
		    int left = 0;
		    
		    int right = arr.length -1;
		    
		    while(left<=right){
		        
		        int mid = (left + right) / 2;
		        
		        if(key < arr[mid]){
		            right = mid - 1;
		        }
		        
		        else if(key > arr[mid]){
		            left = mid +1;
		        }
		        else{
		            return mid;
		        }
		    }
		        
		        return -1;
		        
		}
	}

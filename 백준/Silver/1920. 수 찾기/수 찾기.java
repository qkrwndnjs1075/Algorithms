import java.util.*;
import java.io.*;

public class Main
{
 
    
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
		    arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
		    int key = Integer.parseInt(st.nextToken());
		    
		    if(binary(arr, key) >= 0) {
		        sb.append(1).append("\n");
		    } else {
		        sb.append(0).append("\n");
		    }
		    
		    
		}
		
		System.out.print(sb);
	}
	
	static int binary(int[] arr, int key) {
	    
	    int left = 0;
	    int right = arr.length - 1;
	    
	    while(left <= right) {
	        int mid = left + (right - left) / 2;
	        
	        if(arr[mid] > key) {
	            right = mid - 1;
	        } else if(arr[mid] < key) {
	            left = mid + 1;
	        } else {
	            return mid;
	        }
	    }
	    return -1;
	    
	}
}

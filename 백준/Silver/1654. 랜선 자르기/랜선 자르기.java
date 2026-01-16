import java.util.*;
import java.io.*;

public class Main
{
    static int N = 0;
    static int K = 0;
    static int[] arr;
 
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	    K = Integer.parseInt(st.nextToken());
	    N = Integer.parseInt(st.nextToken());
		
		arr = new int[K];
		long left = 1;
		long right = 0;
		
        for(int i = 0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }
        
        long answer = 0;
        
        while(left <= right) {
            long mid = left + (right - left) / 2;
            
            if(canMake(mid)) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(answer);
        
	}
	
	static boolean canMake(long mid) {
	    long count = 0;
	    for(int x : arr) {
	        count += x / mid;
	    }
	    
	    return count >= N;
	}
}

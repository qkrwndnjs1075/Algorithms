import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N][N];
		
	
		
		for(int i = 0; i < N; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    for(int j = 0; j <= i; j++) {
		        int val = Integer.parseInt(st.nextToken());
		        
		        if(i==0 && j==0){
		            dp[i][j] = val;
		        } else if(j==0) {
		            dp[i][j] = dp[i-1][j] + val;
		        } else if(j==i) { 
		            dp[i][j] = dp[i-1][j-1] + val;
		        } else {
		            dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + val;
		        }
		    }
		}
		
		int answer = 0;
		for(int j = 0; j<N; j++) {
		    answer = Math.max(answer, dp[N-1][j]);
		}
		System.out.println(answer);
		
	}
}

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[N+1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i<=N; i++){
		    dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		    System.out.println(dp[N]);
	}
	    
}
// 1 3 5 7 9 11 13 15 16 + 24 15 39 + 16 = 55
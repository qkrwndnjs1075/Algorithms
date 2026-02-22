import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N1 = Integer.parseInt(br.readLine());

        long[][] dp = new long[30][30];

        for (int m = 0; m < 30; m++) dp[0][m] = 1; 
        for (int m = 0; m < 30; m++) dp[1][m] = m;     
        for (int n = 0; n < 30; n++) dp[n][n] = 1;

        for(int i = 2; i< 30; i++) {
            for(int j = i + 1; j<30; j++){
                dp[i][j] = dp[i][j-1] + dp[i - 1][j - 1]; 
            }
        }

        for(int i = 0; i<N1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(dp[N][M]).append("\n");
        }
        System.out.print(sb);
        
    }
}
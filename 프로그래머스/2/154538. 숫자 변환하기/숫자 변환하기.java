import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        
        if(x == y) return 0;
        
        int[] dp = new int[y+1];
        for(int i=0; i<=y; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[x] = 0;
        
        for(int i = x; i<y; i++){
            if(dp[i] == Integer.MAX_VALUE) continue;
            
            int nextOperation = dp[i] + 1;
            int[] candidate = {i + n, i * 2, i * 3};
            
            for(int next : candidate){
                if(next <= y){
                    dp[next] = Math.min(dp[next], nextOperation);
                }
            }
            
        }
        return dp[y] == Integer.MAX_VALUE ? -1 : dp[y];
         
    }
}
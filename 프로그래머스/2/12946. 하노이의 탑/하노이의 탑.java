import java.util.*;

class Solution {
    private static List<int[]> arr = new ArrayList<>();

    public int[][] solution(int n) {
        
        move(n, 1, 2, 3);
        
        int[][] answer = new int[arr.size()][];
        for(int i = 0; i< arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }

    private static void move(int n, int start, int mid, int end) {
        if (n == 0) {
            return;
        }
        
        move(n-1,start,end,mid);
        
        arr.add(new int[]{start,end});
        
        move(n-1,mid,start,end);
        
    }
}
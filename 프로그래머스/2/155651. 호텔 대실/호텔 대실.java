import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        
    int[][] times = new int[book_time.length][2];
    for(int i = 0; i< book_time.length; i++ ){
        times[i][0] = parseTime(book_time[i][0]);
        times[i][1] = parseTime(book_time[i][1]) + 10;
    }
        Arrays.sort(times, (a,b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int[] time : times) {
            int start = time[0];
            int end = time[1];
            
            if(!q.isEmpty() && q.peek() <= start){
                q.poll();
            }
            
            q.add(end);
        }
        
        return q.size();
         
    }
    
    private int parseTime(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        return hour * 60 + minutes;
    }
}
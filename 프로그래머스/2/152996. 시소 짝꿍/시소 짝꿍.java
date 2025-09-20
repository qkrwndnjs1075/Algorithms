import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0; // answer 변수가 없어서 추가했습니다.
        
        Arrays.sort(weights);
        
        HashMap<Integer, Long> weightCounts = new HashMap<>();
        
        for(int w : weights) {
            
            // 1:1 비율
            if(weightCounts.containsKey(w)) {
                answer += weightCounts.get(w);
            }
            
            // 1:2 비율 (2m, 4m)
            if(w % 2 == 0) {
                int partner = w / 2;
                if(weightCounts.containsKey(partner)) {
                    answer += weightCounts.get(partner);
                }
            }
            
            // 2:3 비율 (2m, 3m) - 수정된 부분
            if(w % 3 == 0) {
                int partner = w * 2 / 3;
                if(weightCounts.containsKey(partner)) {
                    answer += weightCounts.get(partner);
                }
            }
            
            // 3:4 비율 (3m, 4m) - 수정된 부분
            if(w % 4 == 0) {
                int partner = w * 3 / 4;
                if(weightCounts.containsKey(partner)) {
                    answer += weightCounts.get(partner);
                }
            }
            
            weightCounts.put(w, weightCounts.getOrDefault(w, 0L) + 1);
        }
        return answer;
    }
}
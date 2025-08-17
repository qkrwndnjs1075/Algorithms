import java.util.*;

class Solution {
   public long solution(int[] weights) {
       Map<Integer, Integer> weightCount = new HashMap<>();
       
       // 무게별 개수 카운트
       for (int weight : weights) {
           weightCount.put(weight, weightCount.getOrDefault(weight, 0) + 1);
       }
       
       long result = 0;
       Set<String> processedPairs = new HashSet<>();
       
       for (Map.Entry<Integer, Integer> entry1 : weightCount.entrySet()) {
           int weight1 = entry1.getKey();
           int count1 = entry1.getValue();
           
           for (Map.Entry<Integer, Integer> entry2 : weightCount.entrySet()) {
               int weight2 = entry2.getKey();
               int count2 = entry2.getValue();
               
               if (weight1 > weight2) continue; // 중복 방지
               
               String pairKey = weight1 + "," + weight2;
               if (processedPairs.contains(pairKey)) continue;
               processedPairs.add(pairKey);
               
               if (weight1 == weight2) {
                   // 같은 무게인 경우: nC2 = n * (n-1) / 2
                   result += (long) count1 * (count1 - 1) / 2;
               } else if (canBalance(weight1, weight2)) {
                   // 다른 무게지만 균형 가능한 경우
                   result += (long) count1 * count2;
               }
           }
       }
       
       return result;
   }
   
   private boolean canBalance(int weight1, int weight2) {
       int[] distances = {2, 3, 4};
       
       // weight1 * d1 = weight2 * d2 인지 확인
       for (int d1 : distances) {
           for (int d2 : distances) {
               if (weight1 * d1 == weight2 * d2) {
                   return true;
               }
           }
       }
       return false;
   }
}
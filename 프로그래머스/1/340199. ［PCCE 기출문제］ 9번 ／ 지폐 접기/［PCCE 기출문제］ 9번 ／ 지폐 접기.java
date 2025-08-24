import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 지갑과 지폐의 크기를 오름차순으로 정렬
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            // 지폐의 긴 변을 반으로 접음
            if (bill[0] >= bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            
            // 접은 후 지폐의 크기를 다시 정렬하여 최신화
            Arrays.sort(bill);
            
            // 접는 횟수 증가
            answer++;
        }
        
        return answer;
    }
}
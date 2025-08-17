import java.util.*;

class Solution {
   public int solution(String[][] book_time) {
       List<int[]> events = new ArrayList<>();
       
       // 모든 예약을 시작/종료 이벤트로 변환
       for (String[] booking : book_time) {
           int start = timeToMinutes(booking[0]);
           int end = timeToMinutes(booking[1]) + 10; // 청소시간 10분 추가
           
           events.add(new int[]{start, 1});  // 입실 이벤트
           events.add(new int[]{end, -1});   // 퇴실 이벤트
       }
       
       // 시간순 정렬 (같은 시간이면 퇴실(-1)을 먼저)
       events.sort((a, b) -> {
           if (a[0] == b[0]) return a[1] - b[1];
           return a[0] - b[0];
       });
       
       int currentRooms = 0;
       int maxRooms = 0;
       
       for (int[] event : events) {
           currentRooms += event[1];
           maxRooms = Math.max(maxRooms, currentRooms);
       }
       
       return maxRooms;
   }
   
   private int timeToMinutes(String time) {
       String[] parts = time.split(":");
       return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
   }
}
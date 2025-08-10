import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkedCars = new HashMap<>();
        Map<String, Integer> totalTimes = new HashMap<>();
        
        // 입출차 기록 처리
        for (String record : records) {
            String[] parts = record.split(" ");
            int time = parseTime(parts[0]);
            String carNumber = parts[1];
            String action = parts[2];
            
            if (action.equals("IN")) {
                parkedCars.put(carNumber, time);
            } else {
                int entryTime = parkedCars.remove(carNumber);
                int parkingTime = time - entryTime;
                totalTimes.put(carNumber, totalTimes.getOrDefault(carNumber, 0) + parkingTime);
            }
        }
        
        // 출차하지 않은 차량은 23:59에 출차 처리
        int endOfDay = 23 * 60 + 59;
        for (Map.Entry<String, Integer> entry : parkedCars.entrySet()) {
            String carNumber = entry.getKey();
            int entryTime = entry.getValue();
            int parkingTime = endOfDay - entryTime;
            totalTimes.put(carNumber, totalTimes.getOrDefault(carNumber, 0) + parkingTime);
        }
        
        // 차량 번호 오름차순 정렬
        List<String> carNumbers = new ArrayList<>(totalTimes.keySet());
        Collections.sort(carNumbers);
        
        // 요금 계산
        int[] result = new int[carNumbers.size()];
        for (int i = 0; i < carNumbers.size(); i++) {
            String carNumber = carNumbers.get(i);
            int totalTime = totalTimes.get(carNumber);
            result[i] = calculateFee(fees, totalTime);
        }
        
        return result;
    }
    
    private int parseTime(String timeStr) {
        String[] parts = timeStr.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    
    private int calculateFee(int[] fees, int totalTime) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        if (totalTime <= baseTime) {
            return baseFee;
        }
        
        int extraTime = totalTime - baseTime;
        int extraUnits = (int) Math.ceil((double) extraTime / unitTime);
        
        return baseFee + extraUnits * unitFee;
    }
}
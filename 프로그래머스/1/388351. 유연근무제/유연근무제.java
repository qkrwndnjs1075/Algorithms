class Solution {
    /**
     * 상품을 받을 직원의 수를 계산하는 솔루션 함수입니다.
     *
     * @param schedules 각 직원이 설정한 출근 희망 시각 배열
     * @param timelogs  직원들의 일주일간 출근 시각 2차원 배열
     * @param startday  이벤트 시작 요일 (1:월요일 ~ 7:일요일)
     * @return 상품을 받을 직원의 수
     */
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        // 상품을 받을 직원의 수를 저장할 변수
        int answer = 0;
        int numEmployees = schedules.length;

        // 각 직원에 대해 반복
        for (int i = 0; i < numEmployees; i++) {
            // 해당 직원이 평일에 한 번이라도 지각했는지 추적하는 플래그
            boolean isPunctual = true;
            
            // 1. 출근 인정 마감 시각 계산
            int scheduleTime = schedules[i];
            int scheduleHour = scheduleTime / 100;
            int scheduleMinute = scheduleTime % 100;

            // 출근 희망 시각에 10분을 더함
            int deadlineMinute = scheduleMinute + 10;
            int deadlineHour = scheduleHour;

            // 분(minute)이 60을 넘어가면 시(hour)를 1 증가시키고 분을 조정
            if (deadlineMinute >= 60) {
                deadlineHour++;
                deadlineMinute -= 60;
            }
            int deadline = deadlineHour * 100 + deadlineMinute;

            // 2. 이벤트 기간(7일) 동안의 출근 기록 확인
            for (int j = 0; j < 7; j++) {
                // 이벤트 시작일과 경과일을 이용해 현재 요일 계산
                // (startday - 1) : 0-indexed 요일로 변환 (0:월 ~ 6:일)
                // ( ... + j) % 7 : j일 후의 0-indexed 요일
                // ... + 1 : 다시 1-indexed 요일로 변환 (1:월 ~ 7:일)
                int currentDayOfWeek = ((startday - 1) + j) % 7 + 1;

                // 3. 평일(월~금)인지 확인
                if (currentDayOfWeek >= 1 && currentDayOfWeek <= 5) {
                    int arrivalTime = timelogs[i][j];
                    
                    // 마감 시각보다 늦게 출근했으면 지각으로 처리
                    if (arrivalTime > deadline) {
                        isPunctual = false;
                        // 한 번이라도 지각하면 더 이상 확인할 필요가 없으므로 내부 루프 중단
                        break; 
                    }
                }
            }

            // 4. 모든 평일에 지각하지 않았다면 상품 수령자 수 증가
            if (isPunctual) {
                answer++;
            }
        }

        return answer;
    }
}
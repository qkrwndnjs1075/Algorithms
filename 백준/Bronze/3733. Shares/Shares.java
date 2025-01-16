import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력이 끝날 때까지 반복
        while (sc.hasNext()) {
            int N = sc.nextInt(); // 사람 수
            int S = sc.nextInt(); // 총 주식 수

            // 총 인원 수는 N + 1 (사람 + Judge)
            int totalPeople = N + 1;

            // 각 사람이 받을 수 있는 최대 주식 수 계산
            int x = (S >= totalPeople) ? S / totalPeople : 0;

            // 결과 출력
            System.out.println(x);
        }

        // Scanner 닫기
        sc.close();
    }
}
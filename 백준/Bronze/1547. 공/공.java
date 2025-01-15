import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 초기 공의 위치
        int ballPosition = 1;

        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 교환 횟수 M 입력
        int M = sc.nextInt();

        // M번의 교환 작업 수행
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt(); // 첫 번째 컵
            int Y = sc.nextInt(); // 두 번째 컵

            // 공의 위치가 X나 Y와 같다면 위치 업데이트
            if (ballPosition == X) {
                ballPosition = Y;
            } else if (ballPosition == Y) {
                ballPosition = X;
            }
        }

        // 결과 출력
        System.out.println(ballPosition);

        // Scanner 닫기
        sc.close();
    }
}
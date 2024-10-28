import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 5개의 숫자를 배열에 저장
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // 각 숫자의 제곱을 더함
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i] * numbers[i];
        }

        // 10으로 나눈 나머지를 구함
        int verificationNumber = sum % 10;

        // 검증수 출력
        System.out.println(verificationNumber);
        
        // 스캐너 닫기
        sc.close();
    }
}

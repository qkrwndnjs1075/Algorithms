import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 두 도메인의 유명도 N과 M을 입력받음
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        // 두 유명도의 차이를 절댓값으로 계산
        long difference = Math.abs(N - M);
        
        // 결과 출력
        System.out.println(difference);
        
        sc.close();
    }
}
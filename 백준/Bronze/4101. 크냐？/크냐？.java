import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            
            // 종료 조건
            if (a == 0 && b == 0) {
                break;
            }
            
            // 비교 결과 출력
            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

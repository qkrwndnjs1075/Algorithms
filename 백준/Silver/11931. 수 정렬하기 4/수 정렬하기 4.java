import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); // 수의 개수 N 입력받기
        Integer[] numbers = new Integer[N]; // Integer 배열 생성
        
        
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        
        Arrays.sort(numbers, Comparator.reverseOrder());
        
        
        for (int num : numbers) {
            bw.write(num + "\n");
        }
        
        bw.flush(); // BufferedWriter의 내용 출력
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}
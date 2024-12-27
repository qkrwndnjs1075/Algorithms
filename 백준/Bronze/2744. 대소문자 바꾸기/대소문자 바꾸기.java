import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        
        for(int i=0; i<a.length(); i++){
            b = a.charAt(i);
            // charAt() : 문자열에서 문자하나만 가져오는 함수
            
            if(Character.isUpperCase(b)){
            // Character.isUpperCase() : 대문자 인지 확인
                answer += Character.toLowerCase(b);
                // Character.toUpperCase() : 소문자 변환
            } else {
                answer += Character.toUpperCase(b);
                // Character.toLowerCase() : 대문자 변환
            }
        }
        
        System.out.println(answer);
        
    }
}
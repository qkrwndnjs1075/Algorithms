import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long plus = 1;
        long sum = 0;
        
        while(true){
            sum += plus;
            if(n<sum) break;
            plus++;
        } 
        System.out.println(plus - 1);
    }
}

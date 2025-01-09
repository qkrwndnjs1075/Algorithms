import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String jaehwan = scanner.nextLine();
        String doctor = scanner.nextLine();
        
        if (jaehwan.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}

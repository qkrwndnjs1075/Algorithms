import java.io.*;

public class Main {

    public static boolean check(String str) {
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            
            if (prev != now) {
                
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    
                    return false;
                }
            }
            
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (check(str)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

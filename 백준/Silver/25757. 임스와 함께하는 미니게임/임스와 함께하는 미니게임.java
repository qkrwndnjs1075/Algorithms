import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        char p = st.nextToken().charAt(0);
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int need = 0;
        if(p == 'Y') need = 1;
        if(p == 'F') need = 2;
        if(p == 'O') need = 3;

        System.out.print(set.size() / need);


    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) list.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        int cursor = 0;

        int idx1 = list.indexOf("KBS1");
        for(int i = 0; i<idx1; i++) {
            sb.append("1");
            cursor++;
        }

        while(cursor > 0) {
            Collections.swap(list, cursor, cursor - 1);
            sb.append("4");
            cursor--;
        }

        int idx2 = list.indexOf("KBS2");
        for(int i = 0; i<idx2; i++) {
            sb.append("1");
            cursor++;
        }

        while(cursor > 1) {
            Collections.swap(list, cursor, cursor - 1);
            sb.append("4");
            cursor--;
        }

        System.out.print(sb);

        


    }
}
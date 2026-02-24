import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch(cmd){

            case "add":
            set.add(Integer.parseInt(st.nextToken()));
            break;

            case "check":
            int x = Integer.parseInt(st.nextToken());
            sb.append(set.contains(x) ? '1' : '0').append("\n");
            break;

            case "remove":
            set.remove(Integer.parseInt(st.nextToken()));
            break;

            case "toggle":
            x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) set.remove(x);
                else set.add(x);
                break;
            
            case "all":
            set.clear();
            for(int num = 1; num<=20; num++) {
                set.add(num);
            }
            break;

            case "empty":
                    set.clear();
                    break;
            }

        }
        System.out.print(sb);


    }
}
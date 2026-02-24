import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < p; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());

            List<Integer> line = new ArrayList<>(20);
            int moves = 0;

            for(int i = 0; i<20; i++){
                int x = Integer.parseInt(st.nextToken());

                int pos = line.size();
                for(int j = 0; j< line.size(); j++){
                    if(line.get(j) > x) {
                        pos = j;
                        break;
                    }
                }

                moves += (line.size() - pos);
                line.add(pos, x);
                
            }
            sb.append(t).append(' ').append(moves).append("\n");
            
    }
        System.out.print(sb);


    }
}
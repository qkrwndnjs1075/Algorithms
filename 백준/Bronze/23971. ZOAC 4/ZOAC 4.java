import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long ROW = (long)Math.ceil((double)R / (n + 1));
        long COL = (long)Math.ceil((double)C / (m + 1));

        System.out.println(ROW * COL);


        
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine().trim());
        long end = 1;
        int layer = 1;

        while(N > end) {
            end += 6L * layer;
            layer++;
        }
        System.out.println(layer);

    }
}
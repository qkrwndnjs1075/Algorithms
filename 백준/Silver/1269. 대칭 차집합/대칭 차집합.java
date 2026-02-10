import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<a; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }   

        int onlyB = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) {
            int b= Integer.parseInt(st.nextToken());
            if(setA.contains(b)) {
                setA.remove(b);
            } else {
                onlyB++;
            }

        }

        System.out.println(setA.size() + onlyB);
        
    }
}
import java.util.*;
import java.io.*;

public class Main {

    static int[] parent;

    static void init(int n) {
        parent = new int[n + 1];
        for(int i = 0; i<=n; i++){
            parent[i] = i;
        }
    }

    static int find(int x) {
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int RootA = find(a);
        int RootB = find(b);

        if(RootA != RootB) {
            parent[RootB] = RootA;
        }
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        init(n);

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(op == 0) {
                union(a, b);
            }else if(find(a) == find(b)) {
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
                
        }

        System.out.println(sb);


    }
}
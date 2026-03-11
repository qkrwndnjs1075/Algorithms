import java.util.*;
import java.io.*;

public class Main {

    static List<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(' ');

        for(int next : graph[node]) {
            if(!visited[next]) dfs(next);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>(); 
        visited[start] = true;
        queue.offer(start);

        while(!queue.isEmpty()) {
            int f = queue.poll();
            sb.append(f).append(' ');

            for(int next : graph[f]) {
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
        graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<v; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i = 1; i<=n; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[n + 1];
        dfs(start);
        sb.append('\n');

        visited = new boolean[n + 1];
        bfs(start);

        System.out.println(sb);


        
    }
}
import java.util.*;
import java.io.*;

public class Main
{
    static boolean[] visited;
    static int count = 0;
    static List<List<Integer>> graph;
    
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<>();
		for(int i = 0 ; i <= N; i++) {
		    graph.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
		    st = new StringTokenizer(br.readLine());
		    
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		
		visited = new boolean[N + 1];
		
		for(int i = 1; i<=N; i++) {
		    if(!visited[i]){
		        bfs(i);
		        count++;
		    }
		}
		
		System.out.println(count);
		
		
	}
	
	static void bfs(int start) {
	    Queue<Integer> queue = new ArrayDeque<>();
	    queue.offer(start);
	    
	    visited[start] = true;
	    
	    while(!queue.isEmpty()) {
	        
	        int now = queue.poll();
	        
	        for(int next : graph.get(now)) {
	            if(!visited[next]) {
	                visited[next]=true;
	                queue.offer(next);
	            }
	        }
	        
	    }
	}
}

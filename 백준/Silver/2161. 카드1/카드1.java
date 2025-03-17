import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList();
		
		
		
		for(int i=1; i<=N; i++){
		    
		    que.add(i);
		}
		
		while(que.size()!=1){
		    
		    int s = que.poll();
		    System.out.print(s+" ");
		    int d = que.poll();
		    que.add(d);
		}
		
		System.out.print(que.poll());
		
	}
}

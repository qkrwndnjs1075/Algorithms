import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	    
	    int[] arr = new int[101];
	    int[] ans = new int[101];
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> player = new LinkedList<>();
		for(int i=0; i<N; i++){
		    int score = Integer.parseInt(br.readLine()) - 1;
		    player.add(score, i);
		}
		
		LinkedList<Integer> finalPlayer = new LinkedList<>();
		for(int j= M; j>0; j--){
		    int num = player.get(j-1);
		    int score = Integer.parseInt(br.readLine()) -1;
		    finalPlayer.add(score, num);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(finalPlayer.get(i)+1);
		}
        
		
		
		
		
	}
}

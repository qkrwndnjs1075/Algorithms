import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int piece = Integer.MAX_VALUE;
		int pack = Integer.MAX_VALUE;
		int answer = 0;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<M; i++){
		    st = new StringTokenizer(br.readLine(), " ");
		    
		    pack = Math.min(pack, Integer.parseInt(st.nextToken()));
		    piece = Math.min(piece, Integer.parseInt(st.nextToken()));
		    
		}
		
		if(piece * 6 <= pack){
		    answer += piece * N;
		}else{
		    
		    answer += (N/6) * pack;
		    if( (N%6) * piece <= pack ){
		        answer += (N%6) * piece;
		    }else{
		        answer += pack;
		    }
		}
		
		System.out.println(answer);
		
	}
}

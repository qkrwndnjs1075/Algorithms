import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int ji = Integer.parseInt(st.nextToken());
		int ha = Integer.parseInt(st.nextToken());
		int count = 0;
		
		while(ji != ha){
		    
		    ji = ji/2 + ji%2;
		    ha = ha/2 + ha%2;
		    count++;
		    
		}
		
		System.out.println(count);
	}
}

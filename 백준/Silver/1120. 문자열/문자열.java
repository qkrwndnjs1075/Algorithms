import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		String N2 = st.nextToken();
		
		int result = 50;
		
		int lenA = N.length();
        int lenB = N2.length();
		
		for(int i = 0; i<=lenB - lenA; i++){
		    int count = 0;
		    for(int j=0; j<lenA; j++){
		        if(N.charAt(j) != N2.charAt(j + i) ){
		            count++;
		        }
		    }
		    result = Math.min(result, count);
		}
		
		
		System.out.println(result);
		
		
		
		
		
	}
}

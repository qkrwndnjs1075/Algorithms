import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int cnt =0;
		
		for(int i=1; i<S.length(); i++){
		    
		    if(S.charAt(i) != S.charAt(i-1) ){
		        cnt++;
		    }
		    
		}
		
		System.out.println(cnt/2 + cnt%2);
		
	}
}

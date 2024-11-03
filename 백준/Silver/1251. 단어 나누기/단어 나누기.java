import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String left = "";
		String right = "";
		String mid = "";
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 1; i<str.length() -1; i++){
		    left = str.substring(0,i);
		    for(int j= i + 1; j<str.length(); j++){
		        
		        String tmp = new String();
		        mid = str.substring(i,j);
		        right = str.substring(j);
		        
		        tmp += backword(left);
		        tmp += backword(mid);
		        tmp += backword(right);
		        list.add(tmp);
		    }
		}
		
		Collections.sort(list);
		System.out.println(list.get(0));
		
		
	}
	
	public static String backword(String word){
	    
	    String tmp = "";
	    for(int i = word.length() - 1; i>=0; i--){
	        tmp += word.charAt(i);
	    }
	    return tmp;
	}
}

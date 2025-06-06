import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		
		for(int i = 0; i<N; i++){
		    String book = br.readLine();
		    map.put(book, map.getOrDefault(book, 0) + 1);
		    max = Math.max(max, map.get(book));
		    
		}
		ArrayList<String> list = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()){
		    if(entry.getValue() == max){
		        list.add(entry.getKey());
		        
		    }
		}
		    
		    Collections.sort(list);
		    
		    System.out.print(list.get(0));
		
		
		
	}
}

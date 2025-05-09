import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int n = Integer.parseInt(br.readLine());
	    
	    String[] arr = new String[n];
	    
	    for(int i=0; i<n; i++){
	        arr[i] = br.readLine();
	    }
	    
	    Arrays.sort(arr, new Comparator<String>(){
	        public int compare(String o1, String o2){
	            return Integer.compare(o2.length(), o1.length());
	        }
	    });
	    
	    HashSet<String> set = new HashSet<>();
	    for(String o1 : arr){
	        if(set.size() ==0){
	            set.add(o1);
	            continue;
	        }
	    
	    boolean istrue = true;
	    for(String o2 : set){
	        if(o2.startsWith(o1)){
	            istrue = false;
	            break;
	        }
	    }
	    if(istrue){
	        set.add(o1);
	    }
	    
	}
	    
	    System.out.println(set.size());
	    
	    
	    
	}
}

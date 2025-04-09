import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
 
        List<Integer> list = new ArrayList<>();
        list.add(A);
        
        while(true){
            int temp = list.get(list.size() - 1);
            
            int result = 0;
            
            while(temp != 0){
                result += (int) Math.pow(temp % 10, (double) P);
                temp /= 10;
            }
            
            if(list.contains(result)){
                int ans = list.indexOf(result);
                System.out.print(ans + "\n");
                break;
            }
            list.add(result);
            
        }
	}
}

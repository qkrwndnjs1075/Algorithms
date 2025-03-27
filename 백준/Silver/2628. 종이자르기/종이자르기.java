import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ans = 0;
		
		int x = Integer.parseInt(st.nextToken()); //세로로
		int y = Integer.parseInt(st.nextToken()); //가로로
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr0 = new ArrayList<>(); // r세로로
		ArrayList<Integer> arr1 = new ArrayList<>(); // 가로로
		
		for(int i=0; i<N; i++){
		    st = new StringTokenizer(br.readLine());
		    if(Integer.parseInt(st.nextToken()) == 0){
		        arr0.add(Integer.parseInt(st.nextToken()));
		    }else{
		        arr1.add(Integer.parseInt(st.nextToken()));
		    }
		}
		
		arr0.add(0);
		arr1.add(0);
		arr0.add(y);
		arr1.add(x);
		
		Collections.sort(arr0);
		Collections.sort(arr1);
		
		int[] ar0 = new int[arr0.size() - 1];
        int[] ar1 = new int[arr1.size() - 1];
		
		for(int i=0; i<arr0.size() -1; i++){
		    
		    ar0[i] = arr0.get(i+1) - arr0.get(i);
		}
		
		for(int i=0; i<arr1.size()-1; i++){
		    
		    ar1[i] = arr1.get(i+1) - arr1.get(i);
		}
		
		Arrays.sort(ar0);
		Arrays.sort(ar1);
		
	
		ans = ar0[ar0.length-1] * ar1[ar1.length-1];
		
		System.out.println(ans);
		
	}
}

import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++){
		    arr[i]=in.nextInt();
		}
		
		Arrays.sort(arr);
		
		int stay= 0;
		int humanStay = 0;
		
		for(int i=0; i<N; i++){
		    
		    stay += humanStay +arr[i];
		    
		    humanStay += arr[i];
		}
		
		System.out.print(stay);
		
		
		
	}
}

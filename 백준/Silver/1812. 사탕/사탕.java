import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] input = new int[N+1];
		
		for(int i=1; i<=N; i++){
		    input[i] = Integer.parseInt(br.readLine());
		}
		
		int[] answer = new int[N+1];
		int sum = 0;
		
		for(int i=0; i<input.length; i++){
		       if(i % 2 ==0){
		           sum -= input[i];
		       }else{
		           sum += input[i];
		       }
		       
		}
		answer[1] = sum / 2;
		
		
		for(int i=2; i<input.length; i++){
		    answer[i] = input[i-1] - answer[i-1];
		}
		for(int i=1; i<=N; i++){
		    System.out.println(answer[i]);
		} 
	}
}

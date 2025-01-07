import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] student_class = new int[N][5];
		
		for(int i=0; i<N; i++){
		    for(int j=0; j<5; j++){
		        student_class[i][j] = sc.nextInt();
		    }
		}
		
		int max = 0;
		int leader = 0;
		
		for(int i=0; i<N; i++){
		    Set<Integer> set = new HashSet<>();
		    for(int j=0; j<5; j++){
		        for(int k=0; k<N; k++){
		           
		           if(student_class[i][j] == student_class[k][j] && k!=i){
		               set.add(k);
		           } 
		        }
		        
		        if(set.size()>max){
		        leader = i;
		        max = set.size();
		        }
		    }
		}
		
		System.out.println(leader + 1);
	
	}
}

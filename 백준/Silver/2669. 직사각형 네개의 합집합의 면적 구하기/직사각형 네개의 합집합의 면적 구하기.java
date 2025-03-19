import java.util.*;
import java.io.*;


public class Main
{
    static int[][] squ = new int[100][100];
    
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		
		for(int i=0; i<4; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int a1 = Integer.parseInt(st.nextToken());
		    int a2 = Integer.parseInt(st.nextToken());
		    int a3 = Integer.parseInt(st.nextToken());
		    int a4 = Integer.parseInt(st.nextToken());
		    
		    	Square(a1, a2, a3, a4);
		}
		
		System.out.println(sum());
		
		
	}

	public static int sum(){
	       int count = 0;
		    for(int i=0; i<100; i++){
		        for(int j=0; j<100; j++){
		            count += squ[i][j];
		        }
		    }
		    return count;
		}
		
		
		public static void Square(int x1, int y1, int x2, int y2){
		    for(int i=x1; i<x2; i++){
		        for(int j=y1; j<y2; j++){
		            squ[i][j] = 1;
		        }
		    }
		}
    }

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] map = new char[101][101];
		int horizontal = 0; // 가로
		int vertical = 0; // 새로
		
		for(int i=0; i<N; i++){
		    String s = br.readLine();
		    for(int j = 0; j<N; j++){
		        map[i][j] = s.charAt(j);
		    }
		}
		
		for(int i=0; i<N; i++){
		    int check_h=0, check_v = 0;
		    for(int j=0; j<N; j++){
		        if(map[i][j] == '.') check_h++;
		        if(map[i][j] == 'X' || (j== N-1)){
		            if(check_h >= 2) horizontal++;
		            check_h = 0;
		        }
		        
		        if(map[j][i] == '.') check_v++;
		        if(map[j][i] == 'X' || (j == N-1)){
		            if(check_v >=2) vertical++;
		            check_v = 0;
		        }
		    }
		}
		System.out.println(horizontal +" "+vertical);
		
	}
}

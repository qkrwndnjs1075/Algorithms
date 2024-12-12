import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
		    
		    int a1 = sc.nextInt();
		    int a2 = sc.nextInt();
		    
		    int result = 1;
		    for(int j=0; j<a2; j++){
		        result = (result*a1)%10;
		    }
		    
		    if(result == 0) System.out.println("10");
		    else System.out.println(result);
		}
		
		
		
	}
}

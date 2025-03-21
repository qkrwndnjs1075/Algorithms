import java.util.*;
import java.io.*;

public class Main
{
    static int W,H,X,Y,P, player = 0;
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	
		
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<P; i++){
		    st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(square(x,y) || half(x,y)){
			    player++;
			}
			
		}
		System.out.println(player);
		
		
	
	}


	
	public static boolean square(int x, int y){
		    if(x >= X && y >= Y && x <= X+W && y <= Y+H){
		        return true;
		    }
		    return false;
		}
		
		public static boolean half(int x, int y){
		    
		    int radius = H/2;
		    
		    if(x<X){
		        
		        int centerX = X;
		        int centerY = Y + radius;
		        
		        double distance = distanced(x,y,centerX,centerY);
		        if(distance <= radius){
		            return true;
		        }
		        
		    }else if(x > X + W){
		        
		        int centerX = X + W;
		        int centerY = Y + radius;
		        double distance = distanced(x,y,centerX,centerY);
		        
		        if(distance <= radius){
		            return true;
		        }
		        
		    }
		    return false;
		}
		


		public static double distanced(int x1,int y1,int x2, int y2){
		    
		    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		    return distance;
		    
		    
		}
}


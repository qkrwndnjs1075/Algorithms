import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	
	String[][] a = new String[10][10];

   
    
    for(int i = 0; i< 10; i++){
        for(int j = 0; j < 10; j++){
            	
         a[i][j] = in.next();
            
        }
    }
    
    int flag = 0;
    for(int i = 0; i<10; i++){
        int count = 0;
        for(int j = 0; j<10; j++){
            if(a[i][0].equals(a[i][j])){
                count++;
            }
        }
        
        if(count == 10){
            flag = 1;
            break;
        }
    }
    
    for(int i = 0; i<10; i++){
        int count = 0;
        for(int j = 0; j<10; j++){
            if(a[0][i].equals(a[j][i])){
                count++;
            }
        }
        
        if(count == 10){
            flag = 1;
            break;
        }
    }
    System.out.println(flag);
    in.close();
    
		
	}
}

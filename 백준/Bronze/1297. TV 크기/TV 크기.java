import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		double answer = Math.sqrt(Math.pow(d,2)/(h*h+w*w));
		System.out.println((int) Math.floor(answer * h)+" "+(int) Math.floor(answer * w));
		sc.close();
		
		
	}
}

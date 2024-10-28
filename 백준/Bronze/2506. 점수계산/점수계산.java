import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] correctProblem = new int[N];

        for(int i=0; i<N; i++){
            correctProblem[i] = sc.nextInt();
        }
        int tot=0, count=0;
        for(int j = 0; j<correctProblem.length; j++){
            if(correctProblem[j] == 1){
                count++;
                tot+=count;
            }else{
                count = 0;
            }
        }
        System.out.println(tot);
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] g = new char[N][N];

        for(int i = 0; i<N; i++){
            g[i] = br.readLine().trim().toCharArray();
        }
        int headX = -1;
        int headY = -1;
        outer:
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(g[i][j] == '*'){
                    headX = i;
                    headY = j;
                    break outer;
                }
            }
        }

        int heartX = headX + 1;
        int heartY = headY;

        int leftArm = 0;
        for(int i = heartY - 1; i>=0; i--){
            if(g[heartX][i] != '*') break;
            leftArm++;
        }

        int rightArm = 0;
        for(int i = headY +1; i<N; i++){
            if (g[heartX][i] != '*') break;
            rightArm++;
        }

        int body = 0;
        int bodyEndX = heartX;
        for(int i = heartX + 1; i < N; i++){
            if(g[i][headY] != '*') break;
            body++;
            bodyEndX = i;
        }

        int leftLeg = 0;
        for(int i = bodyEndX + 1; i<N; i++){
            int y = heartY - 1;
            if(g[i][y] != '*') break;
            leftLeg++;
        }

        int rightLeg = 0;
        for(int i = bodyEndX + 1; i<N; i++) {
            int y = heartY + 1;
            if(g[i][y] != '*') break;
            rightLeg++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(heartX +1 ).append(' ').append(heartY+1 ).append('\n');
        sb.append(leftArm).append(' ')
          .append(rightArm).append(' ')
          .append(body).append(' ')
          .append(leftLeg).append(' ')
          .append(rightLeg);

        System.out.print(sb);


    }
}
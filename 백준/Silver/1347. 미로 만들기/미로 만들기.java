import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        char[] moves = br.readLine().trim().toCharArray();

        int[] dr = {-1,0,1,0}; // 행
        int[] dc = {0, 1, 0, -1}; // 열

        boolean[][] visited = new boolean[101][101];
        int r = 50;
        int c = 50;

        int dir = 2;
        visited[r][c] = true;

        int minR = r, maxR = r, minC = c, maxC = c;

        for(char ch : moves) {
            if(ch == 'L') {
                dir = (dir + 3) % 4;
            } else if(ch == 'R') {
                dir = (dir + 1) % 4;
            } else {
                r += dr[dir];
                c += dc[dir];
                visited[r][c] = true;

                if (r < minR) minR = r;
                if (r > maxR) maxR = r;
                if (c < minC) minC = c;
                if (c > maxC) maxC = c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = minR; i <= maxR; i++) {
            for(int j = minC; j <= maxC; j++){
                sb.append(visited[i][j] ? '.' : '#');
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력: N(열), M(행)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 열의 수 (x 방향)
        int M = Integer.parseInt(st.nextToken());  // 행의 수 (y 방향)

        // 동→남→서→북 (반시계 방향으로 꺾으면서 나선)
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1,  0, -1};

        boolean[][] visited = new boolean[M][N];
        int x = 0, y = 0, dir = 0;
        visited[y][x] = true;

        int total = N * M;
        int count = 1;

        while (count < total) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위 안에 있고, 아직 방문하지 않은 칸이면 이동
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[ny][nx]) {
                x = nx;
                y = ny;
                visited[y][x] = true;
                count++;
            } else {
                // 아니면 왼쪽(반시계)으로 방향 전환
                dir = (dir + 1) % 4;
            }
        }

        // 정답: x y 순서로 출력
        System.out.println(x + " " + y);
    }
}

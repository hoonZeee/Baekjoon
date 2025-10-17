import java.io.*;
import java.util.*;

public class Main {

    static int M, N, K;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int dfs(int x, int y) {
        int size = 1;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (visited[nx][ny] || board[nx][ny] == 1) continue;

            size += dfs(nx, ny);
        }
        return size;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        board = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    board[x][y] = 1;
                }
            }
        }

        List<Integer> areas = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && board[i][j] == 0) {
                    areas.add(dfs(i, j));
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size());
        for (int a : areas) System.out.print(a + " ");
    }
}

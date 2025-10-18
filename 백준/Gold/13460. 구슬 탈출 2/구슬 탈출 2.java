import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static char[][] board;
    static boolean[][][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Ball {
        int rx, ry, bx, by, depth;
        Ball(int rx, int ry, int bx, int by, int depth) {
            this.rx = rx;
            this.ry = ry;
            this.bx = bx;
            this.by = by;
            this.depth = depth;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new char[n][m];
        visited = new boolean[n][m][n][m];

        int rx = 0, ry = 0, bx = 0, by = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') { rx = i; ry = j; }
                if (board[i][j] == 'B') { bx = i; by = j; }
            }
        }
        System.out.println(bfs(rx, ry, bx, by));
    }

    static int bfs(int rx, int ry, int bx, int by) {
        Queue<Ball> q = new LinkedList<>();
        q.add(new Ball(rx, ry, bx, by, 0));
        visited[rx][ry][bx][by] = true;

        while (!q.isEmpty()) {
            Ball cur = q.poll();
            if (cur.depth >= 10) return -1;

            for (int i = 0; i < 4; i++) {
                int[] red = move(cur.rx, cur.ry, dx[i], dy[i]);
                int[] blue = move(cur.bx, cur.by, dx[i], dy[i]);

                if (board[blue[0]][blue[1]] == 'O') continue;
                if (board[red[0]][red[1]] == 'O') return cur.depth + 1;

                if (red[0] == blue[0] && red[1] == blue[1]) {
                    if (red[2] > blue[2]) {
                        red[0] -= dx[i];
                        red[1] -= dy[i];
                    } else {
                        blue[0] -= dx[i];
                        blue[1] -= dy[i];
                    }
                }

                if (!visited[red[0]][red[1]][blue[0]][blue[1]]) {
                    visited[red[0]][red[1]][blue[0]][blue[1]] = true;
                    q.add(new Ball(red[0], red[1], blue[0], blue[1], cur.depth + 1));
                }
            }
        }
        return -1;
    }

    static int[] move(int x, int y, int dx, int dy) {
        int count = 0;
        while (board[x + dx][y + dy] != '#' && board[x][y] != 'O') {
            x += dx;
            y += dy;
            count++;
        }
        return new int[]{x, y, count};
    }
}

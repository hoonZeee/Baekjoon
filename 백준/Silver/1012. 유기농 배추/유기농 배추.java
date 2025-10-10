import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] board;
    static boolean[][] visited;

    static int n;
    static int m;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        for (int i = 0; i < total; i++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            board = new int[n][m];
            visited = new boolean[n][m];

            count = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int tempX = Integer.parseInt(st.nextToken());
                int tempY = Integer.parseInt(st.nextToken());
                board[tempX][tempY] = 1;
            }

            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if(board[j][l] == 1 && !visited[j][l]){
                        dfs(j,l);
                        count++;
                    }
                }
            }
            
            System.out.println(count);

        }

    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny= y + dy[d];

            if(nx >= 0 && ny>=0 && nx<n && ny<m){
                if(!visited[nx][ny] && board[nx][ny] == 1){
                    dfs(nx,ny);
                }
            }
        }
    }
}

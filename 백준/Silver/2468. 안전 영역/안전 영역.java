import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] board;
    static int[][] area;
    static boolean[][] visited;
    
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int count;
    static int max;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); 
        
        board = new int[N][N];
        area = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(parts[j]);
            }
        }

        for (int i = 0; i <= 100; i++) { // 높이
            int height = i;
            count = 0;
            visited = new boolean[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(board[j][k] <= height){
                        area[j][k] = 0;
                    } else {
                        area[j][k] = 1;
                    }
                }
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(area[j][k] == 1 && !visited[j][k]){
                        dfs(j,k);
                        count++;
                    }
                }
            }
            if(count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }

    public static void dfs(int x, int y){
        visited[x][y] =true;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(!visited[nx][ny] && area[nx][ny] == 1){
                    dfs(nx,ny);
                }
            }
        }
    }
}

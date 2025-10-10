import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int N;

    static int[][] board;
    static boolean[][] visited;
    static int[][] area;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int answer = 0;
    static int count;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        visited = new boolean[N][N];
        area = new int[N][N];
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(parts[j]);
            }
        }

        // board 값이 1이면서, visited 가 false 이면 dfs 를 하자. visited 조건을 안걸면 이미 바꾼값도 또 dfs 를 하게 된다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(board[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i,j);
                    result.add(count);
                    answer++;
                }
            }
        }

        System.out.println(answer);
        Collections.sort(result);

        for (int c : result) System.out.println(c);
    }


    public static void dfs(int x, int y) {
        visited[x][y] = true;
        area[x][y] = answer;
        count++;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx>=0 && ny>=0 && nx < N && ny<N) {

                if(!visited[nx][ny] && board[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }

    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int N;
    static int M;
    static int answer;

    static char[][] board;
    static boolean[] visited = new boolean[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board =new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        dfs(0,0,0);

        System.out.println(answer);
    }

    public static void dfs(int x, int y, int depth) {
        int idx = board[x][y] - 'A';
        visited[idx] = true;
        answer = Math.max(answer, depth+1);

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx >= 0 && ny >=0 && nx < N && ny < M) {
                int nextIdx = board[nx][ny] - 'A';
                if(!visited[nextIdx]){
                    dfs(nx, ny, depth+1);
                }
            }
        }
        visited[idx]= false;
    }




}

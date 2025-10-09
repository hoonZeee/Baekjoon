import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static int M,N;
    public static int[][] arr;
    public static int[][] dp;
    public static int[] dy = {-1,1,0,0};
    public static int[] dx = {0,0,-1,1};
    public static int depth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[M][N];
        dp = new int[M][N];

       
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        
        
        System.out.println(dfs(0,0));
    }
    public static int dfs (int x, int y) {

            if (x == M-1 && y == N-1) {
                
                return 1;
            }


        if (dp[x][y] != -1) {
                return dp[x][y];
        }
            dp[x][y] = 0;

        

        for (int i = 0 ; i <4; i++) {
            int tempX = x + dx[i];
            int tempY = y + dy[i];

            
            if (tempX >= 0 && tempY >=0 && tempX < M &&tempY < N && arr[tempX][tempY] < arr[x][y]) {
                dp[x][y] += dfs(tempX,tempY);   
            }
        }
        return dp[x][y];
    }
}
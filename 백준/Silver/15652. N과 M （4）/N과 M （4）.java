import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] visit;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);

        System.out.println(sb);


    }

    public static  void dfs(int N, int M, int depth){
        if(depth == M){
            for (int i = 0; i < M - 1; i++) {
                if (arr[i] > arr[i + 1]) return;
            }

            for(int var : arr ){
                sb.append(var).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
                arr[depth] = i+1;
                dfs(N, M, depth+1);
        }

    }
}

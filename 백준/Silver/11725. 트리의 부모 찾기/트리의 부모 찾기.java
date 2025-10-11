import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;

    static List<Integer>[] graph;
    static boolean[] visited;
    static StringTokenizer st;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        parents = new int[N+1];

        for (int i = 1; i <= N ; i++) {
            graph[i] = new ArrayList<>();
        }


        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            graph[first].add(second);
            graph[second].add(first);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }

    public static void dfs(int idx) {
        visited[idx] = true;

        for(int next : graph[idx]){
            if(!visited[next]){
               parents[next] = idx;
               dfs(next);
            }
        }
    }
}

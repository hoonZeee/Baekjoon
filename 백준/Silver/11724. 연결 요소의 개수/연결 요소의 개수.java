import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static List<Integer>[] graph;
    static StringTokenizer st;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i <= N ; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            graph[first].add(second);
            graph[second].add(first);
        }

        for (int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }
    public static void dfs(int begin){
        visited[begin] = true;

        for (int i = 0; i < graph[begin].size(); i++) {
            int next = graph[begin].get(i);
            if(!visited[next]){
                dfs(next);
            }
        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int begin;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        begin = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i <=N ; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            graph[first].add(second);
            graph[second].add(first);
        }
        for (int i = 1; i <=N ; i++) {
            Collections.sort(graph[i]);
        }

        dfs(begin);

        System.out.println();

        visited = new boolean[N+1];

        bfs(begin);


    }
    public static void dfs(int node){
        visited[node] = true;
        System.out.print(node +" ");

        for (int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }

    }

    public static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = true;
        queue.offer(node);
        while (!queue.isEmpty()){
            int answer = queue.poll();
            System.out.print(answer + " ");
            for (int next : graph[answer]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

    }
}

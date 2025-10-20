
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int firstNode;
    static int secondNode;
    static int total;
    static int range;
    static List<Integer>[] graph;
    static boolean[] visited;
    static StringTokenizer st;
    static int parent;
    static int child;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        total = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        firstNode = Integer.parseInt(st.nextToken());
        secondNode = Integer.parseInt(st.nextToken());
        range = Integer.parseInt(br.readLine());

        graph = new ArrayList[101];
        visited = new boolean[101];

        for (int i = 1; i <= 100; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i <range; i++) {
            st = new StringTokenizer(br.readLine());
            parent = Integer.parseInt(st.nextToken());
            child = Integer.parseInt(st.nextToken());
            graph[parent].add(child);
            graph[child].add(parent);
        }


        dfs(firstNode, secondNode);
        System.out.println(-1);

    }

    private static void dfs(int index, int target) {
        visited[index] = true;
        if(index == target) {
            System.out.println(count);
            System.exit(0);
        }

        for (int next : graph[index]){
            if(!visited[next]) {
                count++;
                dfs(next, target);
                count--;
            }
        }
    }


}

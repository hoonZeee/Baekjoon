import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {

    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static HashSet<String> visited = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int plus = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int mul = Integer.parseInt(st.nextToken());
        int div = Integer.parseInt(st.nextToken());

        dfs(1, arr[0], plus, minus, mul, div);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int depth, int total, int plus, int minus, int mul, int div) {
        if (depth == arr.length) {
            max = Math.max(max, total);
            min = Math.min(min, total);
            return;
        }

        if (plus > 0) dfs(depth + 1, total + arr[depth], plus - 1, minus, mul, div);
        if (minus > 0) dfs(depth + 1, total - arr[depth], plus, minus - 1, mul, div);
        if (mul > 0) dfs(depth + 1, total * arr[depth], plus, minus, mul - 1, div);
        if (div > 0) dfs(depth + 1, total / arr[depth], plus, minus, mul, div - 1);
    }
}

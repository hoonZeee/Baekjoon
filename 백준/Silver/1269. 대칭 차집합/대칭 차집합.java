import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());
        int[] a = new int[aSize];
        int[] b = new int[bSize];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < aSize; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for (int i = 0; i < bSize; i++) {
            b[i] = Integer.parseInt(s[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < aSize; i++) {
            set.add(a[i]);
        }
        int count = 0;
        for (int i = 0; i < bSize; i++) {
            set.remove(b[i]);
        }
        count += set.size();
        set.clear();
        for (int i = 0; i < bSize; i++) {
            set.add(b[i]);
        }
        for (int i = 0; i < aSize; i++) {
            set.remove(a[i]);
        }
        count += set.size();
        System.out.println(count);
    }
}

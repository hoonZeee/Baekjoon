import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        bw.write("<");

        while (!deque.isEmpty()){
            for (int i = 0; i < k-1; i++) {
                deque.addLast(deque.removeFirst());
            }
            bw.write(deque.getFirst().toString());
            deque.removeFirst();
            if(!deque.isEmpty()){
                bw.write(", ");
            }
        }
        bw.write(">");
        bw.flush();;
        br.close();
        bw.close();
    }
}

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 1) {
                int k = Integer.parseInt(st.nextToken());
                deque.addFirst(k);
                //bw.write(deque.getFirst().toString() + "\n");
            } else if (n == 2) {
                int k = Integer.parseInt(st.nextToken());
                deque.addLast(k);
                //bw.write(deque.getLast().toString() + "\n");
            } else if (n == 3) {
                if (!deque.isEmpty()) {
                    bw.write(deque.removeFirst().toString() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (n == 4) {
                if (!deque.isEmpty()) {
                    bw.write(deque.removeLast().toString() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (n == 5) {
                bw.write(String.valueOf(deque.size()) + "\n");
            } else if (n == 6) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (n == 7) {
                if (!deque.isEmpty()) {
                    bw.write(deque.getFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (n == 8) {
                if (!deque.isEmpty()) {
                    bw.write(deque.getLast() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

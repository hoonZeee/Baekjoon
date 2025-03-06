import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());

        Deque<String> deque = new ArrayDeque<>();

        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); 

            if (command.equals("push")) {
                deque.add(st.nextToken());
            } else if (command.equals("pop")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.poll() + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write((deque.isEmpty() ? "1" : "0") + "\n");
            } else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.getFirst() + "\n");
                }
            } else if (command.equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.getLast() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> index = new ArrayDeque<>();

        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < total; i++) {
            deque.add(Integer.parseInt(arr[i]));
        }

        for (int i = 1; i <= total; i++) {
            index.add(i);
        }

        bw.write(index.removeFirst() + " ");
        int k = deque.removeFirst();

        while (!deque.isEmpty()) {

            if (k > 0) {
                for (int j = 0; j < k - 1; j++) {
                    index.addLast(index.removeFirst());
                    deque.addLast(deque.removeFirst());
                }

            } else  {
                for (int j = 0; j < Math.abs(k); j++) {
                    index.addFirst(index.removeLast());
                    deque.addFirst(deque.removeLast());
                }

            }
            bw.write(index.getFirst() + " ");
            k = deque.removeFirst();
            index.removeFirst();
        }

        bw.flush();
        bw.close();
        br.close();
    }

}

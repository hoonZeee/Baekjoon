import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            deque.add(i);
        }

        while (deque.size() > 1){
            deque.removeFirst();
            deque.addLast(deque.removeFirst());

        }
        System.out.println(deque.getFirst());
    }
}

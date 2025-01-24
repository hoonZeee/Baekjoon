import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                // 힙이 비어 있는 경우 0 출력
                if (minHeap.isEmpty()) {
                    bw.write("0\n");
                } else {
                    // 최소값 출력 후 제거
                    bw.write(minHeap.poll() + "\n");
                }
            } else {
                // 힙에 값 추가
                minHeap.add(x);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isPrime(int a) {
        if (a == 1) return false;
        if (a == 2) return true;
        if (a % 2 == 0) return false;
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) return false;
        }
        return true;
    }
}

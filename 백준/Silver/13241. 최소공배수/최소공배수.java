
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = GCD(a,b);

        long lcm = (a * b) / gcd;

        System.out.println(lcm);

        br.close();


    }

    private static long GCD(long a, long b){
        while (b!=0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

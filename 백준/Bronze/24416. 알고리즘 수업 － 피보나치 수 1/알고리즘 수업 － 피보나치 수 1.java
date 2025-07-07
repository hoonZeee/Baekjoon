import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int count1 = 0;
    public static int count2 = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        fib(N);

        fibonacci(N);

        System.out.println(count1+" "+count2);

    }

    static int fib(int n){
        if( n == 1 || n == 2){
            count1++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) return 1;

        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            count2++;
            f[i] = f[i - 1] + f[i - 2];  // 코드2
        }

        return f[n];
    }


}

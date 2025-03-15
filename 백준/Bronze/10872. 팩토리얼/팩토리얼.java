import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(Factorial(num));
    }

    static int Factorial(int num) {
        if( num ==1 || num == 0 ){
            return 1;
        }
        return num * Factorial(num - 1);
    }
}

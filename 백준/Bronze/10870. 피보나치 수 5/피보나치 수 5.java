import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int[] arr =new int[21];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= 20; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        System.out.println(arr[input]);




    }
}

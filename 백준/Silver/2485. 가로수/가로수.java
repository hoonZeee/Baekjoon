import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i]  = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int gcd = 0;

        for (int i = 0; i < total-1; i++) {
            int distance = arr[i+1] - arr[i];
            gcd = GCD(distance, gcd);
        }

        System.out.println((arr[total-1] - arr[0])/gcd +1 - arr.length);

        br.close();


    }

    private static int GCD(int a, int b){
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

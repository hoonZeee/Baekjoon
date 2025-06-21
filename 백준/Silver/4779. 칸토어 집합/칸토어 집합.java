import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);

            int length = (int) pow(3, N);
            char[] arr = new char[length];

            for (int i = 0; i < length; i++) arr[i] = '-';

            solution(arr, 0, length - 1);

            System.out.println(new String(arr));
        }

    }

    static void solution(char[] arr, int start, int end) {
        int len = end - start + 1;
        if (len < 3) return;

        int third = len / 3;


        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }


        solution(arr, start, start + third - 1);
        solution(arr, start + 2 * third, end);
    }



}

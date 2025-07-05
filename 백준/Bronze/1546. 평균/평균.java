import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());

        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        double max = 0;

        for (int i = 0; i < N; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            if(max >= arr[i]){
                arr[i] = (arr[i] / max) * 100;
            }
        }

        double sum= 0;

        for (double val : arr){
            sum += val;
        }

        System.out.println(sum / N );






    }
}

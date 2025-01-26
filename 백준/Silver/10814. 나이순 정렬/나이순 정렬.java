import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());

        String[][] arr= new String[total][2];

        for (int i = 0; i < total; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = input[0];
            arr[i][1] = input[1];
        }

        Arrays.sort(arr, (p1, p2) -> {
            return Integer.parseInt(p1[0]) - Integer.parseInt(p2[0]);
        });

        for (String[] person : arr){
            bw.write(person[0] + " " + person[1] + "\n");
        }
        bw.flush();
        bw.close();

    }
}

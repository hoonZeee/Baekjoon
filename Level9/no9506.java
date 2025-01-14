package Level9;

import java.io.*;

public class no9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1)
                break;
            int[] arr = new int[num];
            int index = 0;
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if ((num % i) == 0) {
                    arr[index] = i;
                    index++;
                    sum += i;

                }
            }
            if (num == sum) {
                bw.write(num + " = ");
                for (int i = 0; i < index; i++) {
                    if (index - 1 == i) {
                        bw.write(arr[i] + "\n");

                    } else {
                        bw.write(arr[i] + " + ");
                    }
                }
            } else {
                bw.write(num + " is NOT perfect.\n");
            }

        }
        bw.flush();
    }
}

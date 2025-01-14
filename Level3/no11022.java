package Level3;

import java.io.*;
import java.util.StringTokenizer;

public class no11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

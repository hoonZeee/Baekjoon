import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            int gcd = gcd(first, second);
            int lcm = (first * second) / gcd;

            bw.write(lcm + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }


    private static int gcd(int a, int b){
        while( b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }
}

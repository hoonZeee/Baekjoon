import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        while (num != 0) {
            int start = num;
            int end = num * 2;
            int count = 0;

            for (int i = start+1; i <= end; i++) {
                if (isPrime(i)) {
                    count++;

                }
            }
            bw.write(count + "\n");

            num = Integer.parseInt(br.readLine());
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int num){
        if(num == 1 ) return false;
        if(num == 2 ) return true;
        if(num %2 == 0) return false;
        for (int i = 3; i * i <= num ; i+=2) {
            if(num %i ==0) return false;
        }
        return true;
    }
}

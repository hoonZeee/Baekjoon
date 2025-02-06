import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());

        for (int i = 0; i < total; i++) {
            long num = Long.parseLong(br.readLine());
            while (!isPrime(num)){
                num++;
            }
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
    private static boolean isPrime(long num){
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for (long i = 3; i * i <= num ; i+= 2) {
            if( num % i == 0) return false;
        }
        return true;
    }
}

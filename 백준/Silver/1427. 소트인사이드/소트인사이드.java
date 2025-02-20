import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] digits = br.readLine().toCharArray();
        Arrays.sort(digits);        
        StringBuilder sb = new StringBuilder(new String(digits));
        System.out.println(sb.reverse());
    }
}

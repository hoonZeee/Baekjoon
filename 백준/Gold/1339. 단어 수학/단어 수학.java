import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] alpha = new int[26];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int len = s.length();
            for (int j = 0; j < len; j++)
                alpha[s.charAt(j) - 'A'] += Math.pow(10, len - j - 1);
        }
        Arrays.sort(alpha);
        int num = 9, sum = 0;
        for (int i = 25; i >= 0; i--) {
            if (alpha[i] == 0) break;
            sum += alpha[i] * num--;
        }
        System.out.println(sum);
    }
}

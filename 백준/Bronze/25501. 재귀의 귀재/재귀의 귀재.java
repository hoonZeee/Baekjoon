import java.io.*;

public class Main {


    public static String recursion(String s, int l, int r, int count) {
        count++;
        if (l >= r) {
            return "1 " + count;
        } else if (s.charAt(l) != s.charAt(r)) return "0 " + count;
        else return recursion(s, l + 1, r - 1, count);
    }

    public static String isPalindrome(String s) {
        int count = 0;
        return recursion(s, 0, s.length() - 1, count);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            String input = br.readLine();
            String result = isPalindrome(input);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}

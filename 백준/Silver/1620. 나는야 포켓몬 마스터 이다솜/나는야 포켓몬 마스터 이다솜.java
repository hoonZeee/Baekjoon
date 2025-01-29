import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> nameToNum = new HashMap<>();
        HashMap<Integer, String> numToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            nameToNum.put(input, i);
            numToName.put(i, input);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (input.chars().allMatch(Character::isDigit)) {
                int num = Integer.parseInt(input);
                bw.write(numToName.get(num) + "\n");
            } else {
                bw.write(nameToNum.get(input) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        String[] firstArr = new String[first];

        for (int i = 0; i < first; i++) {
            firstArr[i] = br.readLine();
        }
        int count = 0;
        for (int i = 0; i < second; i++) {
            String s = br.readLine();
            for (int j = 0; j < first; j++) {
                if(Objects.equals(firstArr[j], s)){
                    count++;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first= st.nextToken();
            String second = st.nextToken();
            if(set.contains(first)){
                set.add(second);
            } else if (set.contains(second)) {
                set.add(first);
            }
        }

        System.out.println(set.size()+ " ");
        

    }
}

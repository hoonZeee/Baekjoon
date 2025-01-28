import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        HashMap<String, String> hashMap = new HashMap<String, String>();

        for (int i = 0; i < total; i++) {
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter")) {
                hashMap.put(s[0], s[1]);
            } else {
                hashMap.remove(s[0]);
            }
        }

        List<String> keys = new ArrayList<>(hashMap.keySet());
        keys.sort(Comparator.reverseOrder());

        for (String key : keys) {
            System.out.println(key);
        }


    }
}

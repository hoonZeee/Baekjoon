import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(hashSet.contains(s)){
                result.add(s);
            }
        }

        Collections.sort(result);

        bw.write(result.size() + "\n");

        for (String name : result){
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

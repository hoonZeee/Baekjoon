import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        int[] sort = new int[total];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer,Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < total; i++) {
            arr[i] = sort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sort);

        int rank = 0;
        for(int v : sort){
            if(!rankingMap.containsKey(v)){
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

    }
}

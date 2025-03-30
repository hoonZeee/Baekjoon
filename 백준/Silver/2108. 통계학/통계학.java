import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[total];
        int sum = 0;

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            list.add(arr[i]);
        }

        Collections.sort(list);


        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < total; i++) {
            int num = list.get(i);
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int max = Collections.max(hashMap.values());
        List<Integer> modeList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == max) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);
        int maxKey = (modeList.size() >= 2) ? modeList.get(1) : modeList.get(0);



        double mean = (double) sum / (double) total;
        int median = (total / 2);

        int first = list.get(0);
        int last = list.get(list.size()-1);
        int range = last - first;

        System.out.println(Math.round(mean));
        System.out.println(list.get(median));
        System.out.println(maxKey);
        System.out.println(range);
    }
}

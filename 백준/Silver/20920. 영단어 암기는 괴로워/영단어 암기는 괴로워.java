import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> wordList = new ArrayList<>(wordMap.keySet());

        wordList.sort((w1, w2) -> {
            int freq1 = wordMap.get(w1);
            int freq2 = wordMap.get(w2);

            if (freq1 != freq2) {
                return freq2 - freq1; // 자주 나온 단어 먼저
            }

            if (w1.length() != w2.length()) {
                return w2.length() - w1.length(); // 길이가 긴 단어 먼저
            }

            return w1.compareTo(w2); // 알파벳 순
        });

        StringBuilder sb = new StringBuilder();
        for (String word : wordList) {
            sb.append(word).append('\n');
        }

        System.out.print(sb);
    }
}


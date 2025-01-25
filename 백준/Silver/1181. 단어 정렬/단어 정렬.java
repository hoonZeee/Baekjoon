import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        // 버블 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // 길이 비교
                if (arr[i].length() > arr[j].length() || 
                   (arr[i].length() == arr[j].length() && arr[i].compareTo(arr[j]) > 0)) {
                    // 스왑
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 중복 제거 및 출력
        String lastPrinted = "";
        for (String word : arr) {
            if (!word.equals(lastPrinted)) {
                bw.write(word + "\n");
                lastPrinted = word;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

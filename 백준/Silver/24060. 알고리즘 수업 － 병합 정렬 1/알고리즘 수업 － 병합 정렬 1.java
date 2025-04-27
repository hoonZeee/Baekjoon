import java.io.*;
import java.util.*;

public class Main {
    static int K, count = 0, result = -1;
    static int[] A, temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        temp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N - 1);
        System.out.println(result);
    }

    static void mergeSort(int s, int e) {
        if (s < e) {
            int m = (s + e) / 2;
            mergeSort(s, m);
            mergeSort(m + 1, e);
            merge(s, m, e);
        }
    }

    static void merge(int s, int m, int e) {
        int i = s, j = m + 1, t = 0;
        while (i <= m && j <= e) {
            if (A[i] <= A[j]) temp[t++] = A[i++];
            else temp[t++] = A[j++];
        }
        while (i <= m) temp[t++] = A[i++];
        while (j <= e) temp[t++] = A[j++];
        t = 0;
        for (int k = s; k <= e; k++) {
            A[k] = temp[t++];
            count++;
            if (count == K) result = A[k];
        }
    }
}

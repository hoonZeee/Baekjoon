import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        HeapSort(arr);

        for (int num : arr)
            bw.write(num + "\n");
        bw.flush();
        bw.close();


    }
    
    
    static void Heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //부모 왼쪽자식 비교
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        //부모 오른쪽 자식 비교
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            Heapify(arr, n, largest);
        }

    }

    static void HeapSort(int[] arr) {
        int n = arr.length;

        //max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(arr, n, i);
        }

        //최대 힙 구성후 0부터 알고리즘 수행
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //n-1 부터 다시 DownHeap (n= i-1)이니까
            Heapify(arr, i, 0);
        }
    }
}

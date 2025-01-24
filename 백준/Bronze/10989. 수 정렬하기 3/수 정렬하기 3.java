import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        radixSort(arr);

        for(int num : arr)
            bw.write(num + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static void radixSort(int[] arr){
        int max = getMax(arr);
        int exp = 1;

        while(max/exp >0){
            countingSort(arr, exp);
            exp*= 10;
        }
    }

    static void countingSort(int[] arr, int exp){
        int n =arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n-1; i >=0 ; i--) {
            int digit = (arr[i] / exp)% 10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }


    static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if( arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

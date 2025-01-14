package Level4;

import java.util.Scanner;

public class no10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int m = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int u = 0; u < m; u++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}

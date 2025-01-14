package Level4;

import java.util.Scanner;

public class no10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i+1;
        }
        int m = sc.nextInt();
        for (int u = 0; u < m; u++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            while(i < j){
                int temp = arr[i-1];
                arr[i-1] = arr[j-1];
                arr[j-1] = temp;
                i++;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

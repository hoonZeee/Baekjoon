package Level4;

import java.util.Scanner;

public class no2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max=0;
        int maxIndex=0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}

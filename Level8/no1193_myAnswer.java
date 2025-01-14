package Level8;

import java.util.Scanner;

public class no1193_myAnswer {
    public static void main(String[] args) {
        // 1/1 1/2 2/1 3/1 2/2 1/3  1/4 2/3 3/2 4/1 5/1 4/2 3/3 2/4
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int maxSize =0;
        for (int i = 0; maxSize < input ; i++) {
            maxSize += i;
        }

        int[] arr = new int[maxSize];
        int[] arr2 = new int[maxSize];
        int k = 0;
        for (int i = 1; i <= maxSize; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < i; j++) {
                    arr[k] = i - j;
                    arr2[k] = j + 1;
                    k++;
                }
            }
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    arr[k] = j + 1;
                    arr2[k] = i - j;;
                    k++;
                }
            }
            if (k >= input) break; // 필요한 만큼만 반복
        }
//        for (int i = 0; i < input; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println(" ");
//        for (int i = 0; i < input; i++) {
//            System.out.print(arr2[i]);
//        }
        System.out.println(arr[input-1]+"/" + arr2[input-1]);
    }
}

package Level8;

import java.util.Scanner;

public class no1193_CorrectAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // 필요한 최대 배열 크기를 계산
        int maxSize = 0;
        for (int i = 1; maxSize < input; i++) {
            maxSize += i; // 대각선의 원소 개수 합산
            // 1 + 2 + 3 +4 +5
        }

        // 동적으로 계산된 배열 크기 사용
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
                    arr2[k] = i - j;
                    k++;
                }
            }
            if (k >= input) break; // 필요한 만큼만 반복
        }

        System.out.println(arr[input - 1] + "/" + arr2[input - 1]);
    }
}

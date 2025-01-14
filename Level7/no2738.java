package Level7;

import java.util.Scanner;

public class no2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] sum = new int[n][m];
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < m; j++) {
            String[] parts = input.split(" ");
            arr1[i][j] = Integer.parseInt(parts[j]);
            }
        }
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < m; j++) {
                String[] parts = input.split(" ");
                arr2[i][j] = Integer.parseInt(parts[j]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
    }
}

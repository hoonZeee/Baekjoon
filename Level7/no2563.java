package Level7;

import java.util.Scanner;

public class no2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] total = new int[100][100];
        int area = 0;
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    total[j][k] = 1;
                }
            }
        }
        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if (total[j][k] == 1)
                    area++;
            }
        }
        System.out.println(area);
    }
}

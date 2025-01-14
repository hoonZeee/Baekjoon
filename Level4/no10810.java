package Level4;


import java.util.Scanner;

public class no10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        int m = sc.nextInt();

        for (int u = 0; u < m; u++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int l = i-1; l < j; l++) {
                n[l] = k;
            }
        }

        for (int j : n) {
            System.out.print(j + " ");
        }




    }
}

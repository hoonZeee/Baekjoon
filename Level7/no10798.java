package Level7;

import java.util.Scanner;

public class no10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrTemp = new String[15];
        String[][] arr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < 15; j++) {
                if (j < input.length()){
                    arr[i][j] = String.valueOf(input.charAt(j));
                }else {
                    arr[i][j] = "";
                }
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[j][i]);
            }
        }

    }
}

package Level5;

import java.util.Scanner;

public class no2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {
            int num = sc.nextInt();
            String s= sc.next();
            for (int j = 0; j < s.length(); j++) {
                int k =0;
                while( k < num){
                    System.out.print(s.charAt(j));
                    k++;
                }
            }
            System.out.println();
        }
    }
}

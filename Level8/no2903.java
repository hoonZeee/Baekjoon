package Level8;

import java.util.Scanner;

public class no2903 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int a = 2;
        for (int i = 0; i < num; i++) {
            a =a+(a-1);
        }
        int area;
        area = a*a;
        System.out.println(area);
    }
}

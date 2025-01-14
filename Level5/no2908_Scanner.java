package Level5;

import java.util.Scanner;

public class no2908_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String reverse1 = new StringBuilder(num1).reverse().toString();
        String reverse2 = new StringBuilder(num2).reverse().toString();

        int num1reverse = Integer.parseInt(reverse1);
        int num2reverse = Integer.parseInt(reverse2);

        System.out.println(Math.max(num1reverse, num2reverse));

        sc.close();
    }
}

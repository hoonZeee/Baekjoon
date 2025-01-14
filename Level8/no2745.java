package Level8;

import java.util.Scanner;

public class no2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B =sc.nextInt();

        int result = 0;
        int exponent = 0;
        int num = 0;

        for (int i = N.length()-1; i >=0 ; i--) {
            char ch = N.charAt(i);
            if (ch>='0' && ch<='9')
                num = ch-'0';
            else
                num = ch -'A'+10;
            result += (int) (num* Math.pow(B, exponent++));
        }
        System.out.println(result);

    }
}

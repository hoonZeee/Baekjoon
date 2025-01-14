package Level5;

import java.util.Scanner;

public class no5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[]{
                "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
        };
        int sum = 0;
        String num = sc.next();
        for (int i = 0; i < num.length(); i++) {
            char currentChar = num.charAt(i);
            for (int j = 0; j < str.length; j++) {
                if (str[j].contains(String.valueOf(currentChar)))
                    sum += j + 3;
            }
        }
        System.out.println(sum);
    }
}

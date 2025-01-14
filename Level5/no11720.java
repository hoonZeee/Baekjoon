package Level5;

import java.util.Scanner;

public class no11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        String st = sc.next();
        int sum = 0;
        for (int i = 0; i < total; i++) {
            String a = String.valueOf(st.charAt(i));

            int b = Integer.parseInt(a);
            sum +=b;
        }
        System.out.println(sum);


    }
}

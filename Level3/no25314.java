package Level3;

import java.util.Scanner;

public class no25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        input /= 4;
        for (int i = 0; i < input; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}

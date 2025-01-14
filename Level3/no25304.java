package Level3;

import java.util.Scanner;

public class no25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int number = sc.nextInt();
        int price;
        int proNum;
        int sum=0;
        for (int i = 0; i < number; i++) {
             price = sc.nextInt();
             proNum = sc.nextInt();
             sum += price * proNum;
        }
        if(total == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

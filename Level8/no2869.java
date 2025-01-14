package Level8;

import java.util.Scanner;

public class no2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt(); // 2 5
        int down = sc.nextInt();  // 1 1
        int length = sc.nextInt();  //5 6
        int day = (length-down) / (up-down);  //4 2

        if(((length-down) % (up - down)) != 0){
            day++;
        }
        System.out.println(day);

    }
}

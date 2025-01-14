package Level2;

import java.util.Scanner;

public class no2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0) {  //연도가 400의 배수이면 윤년
            System.out.print(1);
        } else if (year % 4 == 0 && year % 100 != 0) {  //연도가 4의 배수고 100의 배수가 아니면 윤년
            System.out.print(1);
        } else {  //나머지는 다 윤년이 아니다
            System.out.print(0);
        }
    }
}

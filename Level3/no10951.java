package Level3;

import java.util.Scanner;

public class no10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.hasNext : 입력이 남아있는지 판단. 더이상 입력없을때 반복문 탄출.EOF

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}

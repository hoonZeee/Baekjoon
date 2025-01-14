package Level2;

import java.util.Scanner;

public class no2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;

        if(a==b && b==c){
            sum = 10000+(a*1000);
            System.out.println(sum);
        } else if (a == b) {
            sum = 1000+(a*100);
            System.out.println(sum);
        } else if( b == c ){
            sum = 1000+(b*100);
            System.out.println(sum);

        } else if( a== c){
            sum = 1000+(a*100);
            System.out.println(sum);

        } else {
           int max = (a>b)?(Math.max(a, c)) : (Math.max(b, c));
            System.out.println(max*100);
        }


    }
}

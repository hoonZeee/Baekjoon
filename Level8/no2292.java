package Level8;

import java.util.Scanner;

public class no2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 7 19 37 61 91
        // 6 12 18 24 30

        int total = sc.nextInt();
        int a = 1;
        int i=1;
        if (total ==1){
            System.out.println(1);
            return;
        }
        while (true){
            a= a+6*i; //7 19 37
            if(total <= a){
                System.out.println(i+1);
                break;
            }
            i++;
        }

    }
}

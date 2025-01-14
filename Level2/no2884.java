package Level2;


import java.util.Scanner;

public class no2884 {
    public static void main(String[] args) {
        //백준
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if(m-45<0){
            if(h-1<0){
                System.out.print(23+" ");
                System.out.println(60-45+m);
            }else {
                System.out.print(h - 1 + " ");
                System.out.println(60 - 45 + m);
            }
        }else {
            System.out.print(h+" ");
            System.out.println(m-45);
        }

    }
}

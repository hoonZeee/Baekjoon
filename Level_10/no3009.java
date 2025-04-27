package Level10;

import java.util.Scanner;

public class no3009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int dx;
        int dy;
        if(ax == bx)
            dx = cx;
        else if(ax ==cx)
            dx = bx;
        else
            dx = ax;
        if(ay == by)
            dy = cy;
        else if(ay ==cy)
            dy = by;
        else
            dy = ay;
        System.out.println(dx + " " + dy);


    }
}

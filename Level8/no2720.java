package Level8;

import java.util.Scanner;

public class no2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        for (int i = 0; i < total; i++) {
            int num = sc.nextInt();
            int change1 = 0;
            int change2 = 0;
            int change3 = 0;
            int change4 = 0;
            while (num>=25){
                num-=25;
                change1++;
            }
            while(num>=10){
                num-=10;
                change2++;
            }
            while(num>=5){
                num-=5;
                change3++;
            }
            while(num>0){
                num-=1;
                change4++;
            }
            System.out.println(change1+" "+change2+" "+ change3+" "+change4);
        }
    }
}

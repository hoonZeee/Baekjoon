package Level9;

import java.util.Scanner;

public class no2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = -1;
        for (int i = m; i<=n; i++){
            int count = 0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count ==1){
                sum += i;
                if(min == -1){
                    min = i;
                }

            }
        }
        if(min != -1){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println("-1");
        }

    }
}

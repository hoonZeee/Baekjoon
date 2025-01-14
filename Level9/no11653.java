package Level9;

import java.util.Scanner;

public class no11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            if(num ==1){
                continue;
            }
            while(num%i == 0){
                    num /= i;
                    System.out.println(i);

            }
        }
    }
}

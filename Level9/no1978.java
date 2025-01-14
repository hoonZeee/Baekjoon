package Level9;

import java.util.Scanner;

public class no1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.nextLine());
        int real = 0;
        for (int i = 0; i < total; i++) {
            int num = sc.nextInt();
            int count =0;
            if(num ==1){
                continue;
            }
            for (int j = 2; j < num; j++) {
                if(num % j ==0){
                    count++;
                }
            }
            if(count == 0){
                real++;
            }
        }
        System.out.println(real);
    }
}
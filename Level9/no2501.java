package Level9;

import java.util.Scanner;

public class no2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factor = sc.nextInt();
        int[] arr = new int[num];
        int index =0;
        for (int i = 1; i <=num; i++) {
           if(num % i ==0 ){
               arr[index] = i;
               index++;
           }
        }
        if(factor > index){
            System.out.println(0);
        }else {
            System.out.println(arr[factor-1]);
        }
    }
}

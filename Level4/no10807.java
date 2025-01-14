package Level4;

import java.util.Scanner;

public class no10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        int result = sc.nextInt();
        for (int i = 0; i < num; i++) {
           if(result == arr[i])
               sum ++;
        }
        System.out.println(sum);
    }
}

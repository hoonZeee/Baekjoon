package Level4;

import java.util.Scanner;

public class no10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        int num = Integer.parseInt(sc.next());
        int[] arr =new int[total];

        for (int i = 0; i < total; i++) {
            int input = Integer.parseInt(sc.next());
            arr[i] = input;
        }
        for (int i = 0; i < arr.length; i++) {
            if(num >arr[i])
                System.out.print(arr[i] + " ");
        }
    }
}

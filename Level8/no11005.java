package Level8;

import java.util.Scanner;

public class no11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //60466175
        int B = sc.nextInt(); //36
        int temp = N;
        int size = 0;
        while (temp > 0) {
            temp = temp / B;
            size++;
        }
        int index = size - 1;
        String[] arr = new String[size];
        while (N > 0) {
            temp = N % B;
            if (temp < 10) {
                arr[index--] = String.valueOf(temp);
            } else {
                arr[index--] = String.valueOf((char) ('A' + (temp - 10)));
            }
            N /= B;
        }
        for (String s : arr) {
            System.out.print(s);
        }
    }
}

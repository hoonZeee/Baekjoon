package Level4;

import java.util.Scanner;

public class no1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        double[] arr = new double[total];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if (max < arr[i])
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }

        double avg = sum / total;
        System.out.println(avg);
    }
}

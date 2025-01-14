package Level4;


import java.util.Scanner;

public class no10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int first = sc.nextInt();
        arr[0] = first;
        int min = first;
        int max=  first;


        for (int i = 1; i < num; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

}

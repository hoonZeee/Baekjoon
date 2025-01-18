import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int sum = sc.nextInt();
        int max = 0;

        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < total-2; i++) {
            for (int j = i+1; j < total-1; j++) {
                for (int k = j+1; k < total; k++) {
                    int count = arr[i] + arr[j] + arr[k];
                    if(count > max && count <= sum){
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

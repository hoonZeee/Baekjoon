import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
//        int count =0;
//        for (int i = 1; i <= n-1; i++) {
//            for (int j = i+1; j <= n; j++) {
//                count++;
//            }
//        }
        System.out.println((n*(n-1))/2);
        System.out.println(2);
    }
}

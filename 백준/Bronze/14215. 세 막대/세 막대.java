import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b <= c) {
            c = a + b - 1;
            System.out.println(a + b + c);
        }
        else if (b + c <= a) {
            a = b + c - 1;
            System.out.println(a + b + c);
        }
        else if (a + c <= b) {
            b = a + c - 1;
            System.out.println(a + b + c);
        }
        else
            System.out.println(a+b+c);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c= sc.nextInt();
        int n = sc.nextInt();
        if((a1*n + a0) <= c*n &&a1 <= c)
            System.out.println(1);
        else
            System.out.println(0);
        
    }
}

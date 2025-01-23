import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int N = 666;
        int count = 1;

        while(count != num){
            N++;
            if(String.valueOf(N).contains("666"))
                count++;
        }
        System.out.println(N);
    }
}

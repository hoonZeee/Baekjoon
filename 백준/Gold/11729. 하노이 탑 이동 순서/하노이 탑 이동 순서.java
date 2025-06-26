import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 1, 3, 2);
        System.out.println(count);
        System.out.print(sb);
    }

    public static void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }
        hanoi(n - 1, from, via, to);
        sb.append(from).append(" ").append(to).append("\n");
        count++;
        hanoi(n - 1, via, to, from);
    }
}

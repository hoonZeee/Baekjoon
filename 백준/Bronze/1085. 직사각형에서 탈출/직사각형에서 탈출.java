import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int minX = Math.min(w - x, x);
        int minY = Math.min(h - y, y);
        int totalMin = Math.min(minX, minY);
        System.out.println(totalMin);
    }
}

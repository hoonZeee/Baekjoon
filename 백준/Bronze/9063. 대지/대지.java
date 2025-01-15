import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int minX = x;
        int minY = y;
        int maxX = x;
        int maxY = y;
        for (int i = 0; i < total-1; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x < minX)
                minX = x;
            if (y < minY)
                minY = y;
            if (x > maxX)
                maxX = x;
            if (y > maxY)
                maxY = y;
        }
        System.out.println((maxX-minX) * (maxY-minY));
    }
}

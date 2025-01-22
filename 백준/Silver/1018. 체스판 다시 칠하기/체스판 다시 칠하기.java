import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = sc.nextLine();
        }

        int minChanges = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int changes1 = 0;
                int changes2 = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char current = board[i + x].charAt(j + y);
                        if ((x + y) % 2 == 0) {
                            if (current != 'W') changes1++;
                            if (current != 'B') changes2++;
                        } else {
                            if (current != 'B') changes1++;
                            if (current != 'W') changes2++;
                        }
                    }
                }

                minChanges = Math.min(minChanges, Math.min(changes1, changes2));
            }
        }
        System.out.println(minChanges);
    }
}

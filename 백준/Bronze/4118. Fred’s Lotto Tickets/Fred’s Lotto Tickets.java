import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;

            Set<Integer> coveredNumbers = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String[] nums = sc.nextLine().split(" ");
                for (String num : nums) {
                    coveredNumbers.add(Integer.parseInt(num));
                }
            }

            if (coveredNumbers.size() == 49 && coveredNumbers.containsAll(makeFullSet())) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static Set<Integer> makeFullSet() {
        Set<Integer> full = new HashSet<>();
        for (int i = 1; i <= 49; i++) {
            full.add(i);
        }
        return full;
    }
}

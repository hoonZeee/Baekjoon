package Level4;

import java.util.ArrayList;
import java.util.Scanner;

public class no5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 28; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 1; i <= 30; i++) {
            if (!list.contains(i)){
                System.out.println(i);
            }
        }

    }
}

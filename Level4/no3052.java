package Level4;

import java.util.ArrayList;
import java.util.Scanner;

public class no3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
            for (int j = 0; j < 10; j++) {
                int a = list.get(i)%42;
                if(!result.contains(a))
                    result.add(a);
            }
        }
        System.out.println(result.size());
    }

}

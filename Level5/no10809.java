package Level5;

import java.util.Arrays;
import java.util.Scanner;

public class no10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[26];
        Arrays.fill(arr, -1);

        String s= sc.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(arr[ch- 'a']== -1)
                arr[ch - 'a'] = i;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

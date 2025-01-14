package Level5;

import java.util.Scanner;

public class no1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // 양쪽 끝 공백 제거
        if (s.isEmpty()) { // 공백만 입력된 경우
            System.out.println(0);
        } else {
            String[] words = s.split(" "); // 공백 기준으로 단어 분리
            System.out.println(words.length);
        }
    }
}


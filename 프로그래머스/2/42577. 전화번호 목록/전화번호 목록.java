import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;


        HashSet<Integer> hashSet = new HashSet<>();

        Arrays.sort(phone_book);


        for (int i = 0; i < phone_book.length-1; i++) {

            String[] temp1 = new String[phone_book[i].length()];

            String[] temp2 = new String[phone_book[i+1].length()];
            for (int j = 0; j < phone_book[i].length(); j++) {
                temp1[j] = String.valueOf(phone_book[i].charAt(j));
            }
            for (int j = 0; j < phone_book[i+1].length(); j++) {
                temp2[j] = String.valueOf(phone_book[i+1].charAt(j));
            }


            boolean isPrefix = true;
            for (int j = 0; j < temp1.length; j++) {
                if (!temp1[j].equals(temp2[j])) {
                    isPrefix = false;
                    break;
                }
            }

            if (isPrefix) {
                answer = false;
                break;
            }


        }


        return answer;
    }
}
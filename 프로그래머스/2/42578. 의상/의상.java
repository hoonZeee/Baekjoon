import java.util.HashSet;
import java.util.Objects;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        
        HashSet<String> hashSet = new HashSet<>();
        for (String[] clothe : clothes) {
            hashSet.add(clothe[1]);
        }


        Object[] arr = hashSet.toArray();
        int[] countArr = new int[arr.length];


        for (int i = 0; i < clothes.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Objects.equals(clothes[i][1], arr[j].toString())) {
                    countArr[j]++;
                }
            }
        }


        int caseNum = 1;
        for (int i = 0; i < countArr.length; i++) {
            caseNum *= (countArr[i] + 1); 
        }

        answer = caseNum - 1; 


        return answer;
    }
    
}
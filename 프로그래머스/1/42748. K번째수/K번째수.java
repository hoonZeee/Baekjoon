import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        //1,5,2,6,3,7,4

        int count = 0;




        for(int[] num : commands){

            int i = num[0]; //2
            int j = num[1]; //5
            int k = num[2]; //3

            int temp[] = new int[j-i+1];

            for (int l = 0; l < temp.length; l++) {
                temp[l] = array[l+i-1];
            }

            Arrays.sort(temp);

            answer[count] = temp[k-1];



            count++;


        }

        return answer;
    }
}
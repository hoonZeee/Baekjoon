import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {  //nums = {1, 2, 3, 4, 4, 5}
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        int size = nums.length / 2;


        if(hashSet.size()>size){
            answer = size;
        }else{
            answer =  hashSet.size();
        }

        return answer;
    }
}
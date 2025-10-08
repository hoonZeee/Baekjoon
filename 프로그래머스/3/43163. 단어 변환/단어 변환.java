class Solution {
   static boolean[] visited;
    static int answer = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {

        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return (answer == Integer.MAX_VALUE) ? 0 : answer;
    }

    public void dfs (String begin, String target, String[] words, int index) {

        if(begin.equals(target)){
            answer = Math.min(answer, index);
            return;
        }


        for (int i = 0; i < words.length; i++) {

            if(!visited[i]){
                int count = 0 ;
                for (int j = 0; j < begin.length(); j++) {
                    if (begin.charAt(j) == words[i].charAt(j)){
                        count++;
                    }
                }

                if(count == begin.length() - 1) {
                    visited[i] = true;
                    dfs(words[i], target, words, index + 1);
                    visited[i] = false;
                }
            }
        }

    }
}
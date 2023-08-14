class Solution {
    public int[] solution(int n) {
        int[] answer;
        int m = 0;
            
        if(n%2 != 0) {
            answer = new int[n/2 + 1];
        } else {
            answer = new int[n/2];
        }
        
        for(int i=0; i<=n; i++) {
            if(i % 2 != 0) {
                answer[m] = i;
                m++;
            }
        }
            
        return answer;
    }
}
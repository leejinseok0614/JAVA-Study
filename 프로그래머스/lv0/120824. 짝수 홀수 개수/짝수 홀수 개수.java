class Solution {
    public int[] solution(int[] num_list) {
        int oddcnt = 0;
        int evencnt = 0;
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 0)
                oddcnt++;
            else
                evencnt++;
        }
        
        int[] answer = {oddcnt, evencnt};
        
        return answer;
    }
}
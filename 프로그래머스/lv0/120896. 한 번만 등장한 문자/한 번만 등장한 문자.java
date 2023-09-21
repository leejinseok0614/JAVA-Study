import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split);
        
        for(int i=0; i<split.length; i++) {
            int count = 0;
            
            for(int j=0; j<split.length; j++) {
                if(split[i].equals(split[j])) {
                    count++;
                }
            }
            
            if(count == 1) {
                answer += split[i];
            }
        }
        
        return answer;
    }
}
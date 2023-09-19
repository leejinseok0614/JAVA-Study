class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] split = cipher.split("");
        
        for(int i=0; i<split.length; i++) {
            if((i+1) % code == 0)
                answer += split[i];
        }
        
        return answer;
    }
}
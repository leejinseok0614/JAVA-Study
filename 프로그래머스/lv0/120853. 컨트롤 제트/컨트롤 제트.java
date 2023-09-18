class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] split = s.split(" ");
        
        for(int i=0; i<split.length; i++) {
            if(split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i-1]);
            } else {
                answer += Integer.parseInt(split[i]);
            }
        }
        return answer;
    }
}
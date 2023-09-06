class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intStr = my_string.replaceAll("[^0-9]", ""); //정규표현식 replaceAll("[^0-9]", "") 사용
        
        char[] num = intStr.toCharArray();
        
        for(int i=0; i<num.length; i++) {
            answer += num[i] - '0';
        }
        
        return answer;
    }
}
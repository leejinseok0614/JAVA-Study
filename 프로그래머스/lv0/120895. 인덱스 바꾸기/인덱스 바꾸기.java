class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] str = my_string.split("");
        
        String tmp = "";
        
        tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;
        
        String answer = String.join("", str);
        
        return answer;
    }
}
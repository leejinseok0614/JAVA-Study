class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = "" + order;
        
        for (int i = 0; i < strOrder.length(); i++) {
            char tempChar = strOrder.charAt(i);

            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int money) {
        int cup = 0;
        int change = 0;
        
        cup = money / 5500;
        change = money - (cup * 5500);
        
        int[] answer = {cup, change};
        
        return answer;
    }
}
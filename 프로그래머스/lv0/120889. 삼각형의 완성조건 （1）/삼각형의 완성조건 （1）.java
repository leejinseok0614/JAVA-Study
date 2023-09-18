import java.util.*;

class Solution {
    public int solution(int[] sides) { //크기별로 정렬하고, 가장 큰 수와 나머지의 합 비교
        int answer = 0;
        Arrays.sort(sides);
        
        if(sides[0] + sides[1] > sides[2])
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}
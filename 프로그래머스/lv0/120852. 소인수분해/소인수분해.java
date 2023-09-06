import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        int i=2; 
        
        while(n>1){
            if(n%i==0){
                arr.add(i);
                n/=i;
            } else{
              i++;  
            }   
        }
        answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
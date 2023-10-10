class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                cnt++;
            }
        }
        
        int[] arr = new int[cnt];
        
        int j = 0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                arr[j] = numlist[i];
                j++;
            }
        }
        
        return arr;
    }
}
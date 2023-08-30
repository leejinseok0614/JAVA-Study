class Solution { //보자마자 재귀함수인걸 알았지만, 해결법을 잘 몰라서 구글 참고했다..
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}
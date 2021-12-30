package programmers;

class addDivisor {
    public int solution(int left, int right) {
        int answer = 0;
        while (left <= right) {
            if (left == Math.pow((int)Math.sqrt(left),2)) {
                answer-=left;
            }
            else answer += left;
            left++;
        }
        return answer;
    }
}
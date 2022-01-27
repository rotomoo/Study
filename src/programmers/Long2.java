package programmers;

class Long2 {
    public int solution(long num) {
        int answer= 0;
        while (answer<500) {
            if (num==1) break;
            if (num%2==0) num /= 2;
            else num = num * 3 + 1;
            answer++;
        }
        return answer < 500 ? answer : -1;
    }
}
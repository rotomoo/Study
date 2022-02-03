package programmers;

class FindPrime {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[1000001];
        for (int i = 2; i <= n; i++) {
            if (ch[i]==1) continue;
            answer++;
            for (int j = i; j <= n; j += i) {
                ch[j]=1;
            }
        }
        return answer;
    }
}
package programmers;

class FindPrime {
    public int solution(int n) {
        int[] ch = new int[n + 1];
        int answer = 0;
        for (int i=2; i<=(int)Math.sqrt(n); i++) {
            if (ch[i]==1) continue;
            for (int j=2*i; j<=n; j+=i) {
                ch[j]=1;
            }
        }

        for (int i=2; i<=n; i++) {
            if (ch[i]==0) answer++;
        }
        return answer;
    }
}
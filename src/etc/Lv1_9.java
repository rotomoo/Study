package etc;

class Lv1_9 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int num = 2; num <= (int)Math.sqrt(n); num++) {
            if (ch[num]==1) continue;
            for (int chInt = 2 * num; chInt <= n; chInt += num) {
                ch[chInt] = 1;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (ch[i]==0) answer++;
        }
        return answer;
    }
}
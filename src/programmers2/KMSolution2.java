package programmers2;

class KMSolution2 {
    public static int solution(int[] T, int[] A) {
        int[] ch = new int[T.length];
        int answer = 0 ;
        for (int i = 0; i < A.length; i++) {
            if (ch[A[i]]==1) continue;
            ch[A[i]]=1;
            int cur_idx = T[A[i]];
            if (ch[cur_idx]==1) continue;
            while (cur_idx!=0) {
                if (ch[cur_idx]==1) break;
                ch[cur_idx]=1;
                cur_idx = T[cur_idx];
            }
            ch[cur_idx] = 1;
        }
        for (int x: ch) if (x==1) answer++;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 1, 2}, new int[]{2}));
    }
}

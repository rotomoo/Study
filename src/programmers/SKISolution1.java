package programmers;

class SKISolution1 {
    public static int[] solution(int[] p) {
        int[] answer = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int min = Integer.MAX_VALUE;
            int jIdx = i;
            for (int j = i; j < p.length; j++) {
                int pj = p[j];
                if (min > pj) {
                    min = p[j];
                    jIdx = j;
                }
            }
            if (i != jIdx) {
                int tmp = p[i];
                p[i] = p[jIdx];
                p[jIdx] = tmp;
                answer[i]++;
                answer[jIdx]++;
            }
        }
        return answer;
    }
}
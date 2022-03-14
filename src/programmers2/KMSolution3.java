package programmers2;

import java.util.Arrays;

class KMSolution3 {
    public static int solution(int[] A) {
        int[] dy = new int[A.length];
        if (A.length ==0 || A.length==1) return 1;
        Arrays.fill(dy, 1);
        int answer = Integer.MIN_VALUE;
        for (int i = 2; i < A.length; i++) {
            if (A[i-2] == A[i]) {
                dy[i] = Math.max(dy[i - 1] + 1, dy[i - 2] + 2);
                answer = Math.max(answer, dy[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 0, 5, 0, 3, 1, 3, 1}));
    }
}

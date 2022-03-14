package programmers2;

import java.util.Arrays;

class KMSolution3 {
    public static int solution(int[] A) {
        int[] dy = new int[A.length];
        if (A.length<=2) return 1;
        Arrays.fill(dy, 1);
        int answer = Integer.MIN_VALUE;
        for (int i = 2; i < A.length; i++) {
            if (A[i-2] == A[i]) {
                if (dy[i-2] > 1 && dy[i-1]==1) dy[i] = dy[i-1] + 2;
                else dy[i] = Math.max(dy[i - 1] + 1, dy[i - 2] + 2);
                answer = Math.max(answer, dy[i]);
            }
            System.out.print(dy[i]+" ");
        }
        System.out.println();
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,0,-1,0,-1,0,2,0,2,2,2}));
    }
}

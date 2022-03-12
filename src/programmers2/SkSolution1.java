package programmers2;

import java.util.Arrays;

class SkSolution1 {
    public static int solution(int money, int[] costs) {
        int[] dy = new int[money + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        int[] arr = {1, 5, 10, 50, 100, 500};
        for (int i = 0; i < costs.length; i++) {
            for (int j = arr[i]; j <= money; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + costs[i]);
            }
        }
        return dy[money];
    }
}
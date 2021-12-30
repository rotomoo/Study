package programmers;

import java.util.Arrays;

public class MakePrime {
    static int[] cb;
    static int answer = 0;

    public static boolean isCheck(int sum) {
        if (sum<=1) return false;
        for (int i=2; i<sum; i++) {
            if (sum%i==0) return false;
        }
        return true;
    }

    public static void DFS(int L, int s, int[] nums) {
        if (L==3) {
            if (isCheck(Arrays.stream(cb).sum())) answer++;
        }
        else {
            for (int i=s; i<nums.length; i++) {
                cb[L]=nums[i];
                DFS(L+1, i+1, nums);
            }
        }
    }

    public int solution(int[] nums) {
        cb = new int[3];
        DFS(0,0,nums);
        return answer;
    }
}

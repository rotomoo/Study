package programmers;

import java.util.HashSet;

public class ponketmon {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        answer = Math.min(set.size(), nums.length/2);
        return answer;
    }

    public static void main(String[] args) {
        ponketmon T = new ponketmon();
        int[] arr = {3,1,2,3};
        System.out.println(T.solution(arr));
    }
}

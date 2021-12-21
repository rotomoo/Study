package programmers;

import java.util.HashSet;

public class ponketmon {
    public int solution(int[] arr) {
        int answer=0;
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        answer=arr.length/2;
        if (set.size()<answer) answer=set.size();
        return answer;
    }

    public static void main(String[] args) {
        ponketmon T = new ponketmon();
        int[] arr = {3,1,2,3};
        System.out.println(T.solution(arr));
    }
}

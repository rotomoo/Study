package programmers;

import java.util.Arrays;

class TSolution2 {
    public int solution(int[] levels) {
        Arrays.sort(levels);
        int len = levels.length;
        int cnt = (int)Math.floor(len * 0.25);
        if (cnt==0) return -1;
        return levels[len - cnt];
    }
}
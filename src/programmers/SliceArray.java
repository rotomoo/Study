package programmers;

import java.util.ArrayList;

class SliceArray {
    public ArrayList<Long> solution(int n, long left, long right) {
        ArrayList<Long> answer = new ArrayList<>();
        for (long i = left; i < right+1; i++) {
            answer.add(Math.max(i / n, i % n) + 1);
        }
        return answer;
    }
}

//class Solution {
//    public int[] solution(int n, long left, long right) {
//        int[] answer = {};
//        int[][] graph = new int[n+1][n+1];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = Math.max(i, j)+1;
//            }
//        }
//        int[] tmp = new int[(int)(right - left + 1)];
//        for (int i = (int)left; i < right+1; i++) {
//            int row = i / n;
//            int col = i % n;
//            tmp[i - (int) left] = Math.max(i / n, i % n);
//        }
//        return tmp;
//    }
//}
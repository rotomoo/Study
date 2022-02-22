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
//        int[] tmp = new int[(int)(right-left+1)];
//        for (int i = (int)left; i < right+1; i++) {
//            tmp[(int)(i-left)] = Math.max(i/n, i%n)+1;
//        }
//        return tmp;
//    }
//}

//class Solution {
//    public int[] solution(int n, long left, long right) {
//        int[] answer = {};
//        int[][] graph = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = Math.max(i, j)+1;
//            }
//        }
//        int[] tmp = new int[(int)(right-left+1)];
//        for (int i = (int)left; i < right+1; i++) {
//            tmp[(int)(i-left)] = graph[i / n][i % n];
//        }
//        return tmp;
//    }
//}

//class Solution {
//    public int[] solution(int n, long left, long right) {
//        int[] answer = {};
//        int[] tmp = new int[n * n];
//        int[][] graph = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = Math.max(i, j)+1;
//                System.out.print(graph[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int row = 0;
//        int col = 0;
//        for (int i = 0; i < n * n; i++) {
//            row = i / n;
//            col = i % n;
//            tmp[i] = graph[row][col];
//            System.out.print(tmp[i]);
//        }
//        return Arrays.copyOfRange(tmp, (int)left, (int)right+1);
//    }
//}
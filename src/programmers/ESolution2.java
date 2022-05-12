package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ESolution2 {
    static ArrayList<ArrayList<Integer>> graph;
    static int answer = Integer.MIN_VALUE;
    static int[] cb;

    // 조합 체크
    public static boolean isCheck(ArrayList<Integer> finished, int[] cb) {

        // to List
        List<Integer> curCb = Arrays.stream(cb).boxed().collect(Collectors.toList());
        
        // 나온 파츠 조합에 완제품이 포함된다면
        if (curCb.containsAll(finished)) return true;
        return false;
    }

    // 조합 뽑기
    public static void DFS(int L, int start, int r, int n) {
        // 로봇이 r개를 골랏을때
        if (L == r) {
            // 계산
            int curCnt = 0;
            for (ArrayList<Integer> finished : graph) {
                if (isCheck(finished, cb)) curCnt++;
            }
            answer = Math.max(answer, curCnt);
            return;
        }
        for (int i = start; i < n; i++) {
            cb[L]=i;
            DFS(L+1, i+1, r, n);
        }
    }

    public int solution(int[][] needs, int r) {
        // graph 초기 설정
        graph = new ArrayList<>();
        for (int i = 0; i < needs.length; i++) {
            graph.add(new ArrayList<>());
        }

        // needs 순회
        for (int i = 0; i < needs.length; i++) {
            for (int j = 0; j < needs[i].length; j++) {
                // 1일 경우
                if (needs[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }

        // 조합 뽑기
        cb = new int[r];
        DFS(0, 0, r, needs[0].length);
        return answer;
    }
}
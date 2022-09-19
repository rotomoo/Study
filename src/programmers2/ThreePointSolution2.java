package programmers2;

import java.util.*;

// 못품 맞는거같은데 테케 다틀리네
class ThreePointSolution2 {
    public int[] solution(int[][] orders) {
        int[] answer = new int[2];
        int N = orders.length;
        int banSoo = N % 2 == 0 ? N / 2 : (N + 1) / 2;
        int cycle = 0;
        ArrayList<Deque<Integer>> qList = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            qList.add(new ArrayDeque<>());
            for (int j = 0; j < orders[i].length; j++) {
                qList.get(i).offerFirst(orders[i][j]);
            }
        }

        for (int i = 0; i < qList.size(); i++) {
            HashMap<Integer, Integer> voteMap = new HashMap<>();
            int maxVote = Integer.MIN_VALUE;
            int minVote = Integer.MAX_VALUE;
            for (int j = 0; j < qList.size(); j++) {
                int key = qList.get(j).peekLast();
                voteMap.put(key, voteMap.getOrDefault(key, 0) + 1);
                maxVote = Math.max(maxVote, voteMap.get(key));
                minVote = Math.min(minVote, voteMap.get(key));
            }
            cycle++;
            
            // 반수 이상 후보가 있을경우
            if (maxVote >= banSoo) {
                for (Integer key : voteMap.keySet()) {
                    if (voteMap.get(key) == maxVote) {
                        answer[1] = Math.max(answer[1], key);
                    }
                }
                answer[0] = cycle;
                break;
            }

            // 후보가 없을경우
            else {
                int minKey = Integer.MAX_VALUE;
                for (Integer key : voteMap.keySet()) {
                    if (voteMap.get(key) == minVote) {
                        minKey = Math.min(minKey, key);
                    }
                }
                for (Deque<Integer> deque : qList) {
                    deque.remove(minKey);
                }
            }
        }
        return answer;
    }
}
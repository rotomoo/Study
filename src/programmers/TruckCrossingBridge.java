package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class TruckCrossingBridge {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        while (true) {
            if (idx == truck_weights.length) {
                answer += bridge_length;
                break;
            }

            answer++;
            if (bridge_length == q.size()) {
                weight += q.poll();
            }

            if (weight - truck_weights[idx] >= 0) {
                q.offer(truck_weights[idx]);
                weight -= truck_weights[idx++];
            }
            else q.offer(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5,6}));
    }
}
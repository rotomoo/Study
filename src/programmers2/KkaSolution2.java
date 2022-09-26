package programmers2;

import java.util.Arrays;

class KkaSolution2 {

    static int answer = Integer.MAX_VALUE;
    static int N, capSize;

    public void findMinDistance(int distance, int curHouse, int curDelivery, int curPickup, int[] deliveries, int[] pickups) {
        if (curHouse > N-1 || curHouse == -2) return;
        if (curDelivery + curPickup > capSize) return;
        if (curDelivery < 0) return;
        if (curHouse == -1 && Arrays.stream(deliveries).max().getAsInt() == 0 && Arrays.stream(pickups).max().getAsInt() == 0) {
            answer = Math.min(answer, distance);
            return;
        }
        if (curDelivery > 0 && deliveries[curHouse] > 0) {
            deliveries[curDelivery] = 0;
//            findMinDistance(distance + 1, curHouse +1, curDelivery - deliveries[curHouse], deliveries, pickups);
        }
        if (pickups[curHouse] > 0) {
//            findMinDistance(distance + 1, curHouse +1, curCap + pickups[curHouse], deliveries, pickups);
        }
    }

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        N = n;
        capSize = cap;
        for (int i = 0; i < cap; i++) {
            findMinDistance(0, -1, i, cap, deliveries, pickups);
        }
        return answer;
    }
}
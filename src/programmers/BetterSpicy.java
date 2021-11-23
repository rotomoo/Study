package programmers;

import java.util.PriorityQueue;

public class BetterSpicy {
    public int solution(int[] scoville, int K) {
        int answer = -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : scoville) {
            pq.offer(x);
        }
        int cnt=0;
        while (!pq.isEmpty()) {
            if (pq.peek()>=K) return cnt;
            else if (pq.size()>=2) {
                pq.offer(pq.poll() + pq.poll() * 2);
                cnt++;
            }
            else return answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        BetterSpicy T = new BetterSpicy();
        int[] priorities={2,1,3,2};
        int location=2;
        System.out.println(T.solution(priorities,location));
    }
}

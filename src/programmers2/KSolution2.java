package programmers2;

import java.util.*;

class KSolution2 {
    static int answer = Integer.MAX_VALUE;
    static HashSet<Queue<Integer>> set = new LinkedHashSet<>();

    public static long calc(Queue<Integer> queue) {
        int sum =0;
        for (Integer integer : queue) {
            sum += integer;
        }
        return sum;
    }

    public static void DFS(int L, long target, Queue<Integer> firstQ, Queue<Integer> secondQ) {
        long secondQS = calc(secondQ);
        if (L >= answer) return;
        if (calc(firstQ) == secondQS && secondQS == target) {
            if (set.contains(firstQ)) return;
            set.add(firstQ);
            System.out.println(firstQ);
            System.out.println(secondQ);
            answer = Math.min(answer, L);
            return;
        }
        if (firstQ.isEmpty()) return;
        int poll = firstQ.poll();
        secondQ.offer(poll);
        DFS(L+1, target, firstQ, secondQ);
        DFS(L+1, target, secondQ, firstQ);
    }

    public static int solution(int[] queue1, int[] queue2) {
        // target, sum1, sum2 구하기
        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();
        long target = (sum1 + sum2) / 2;

        // q1, q2 복사
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i : queue1) {
            q1.offer(i);
        }
        for (int i : queue2) {
            q2.offer(i);
        }
        DFS(0, target, q1, q2);
        DFS(0, target, q2, q1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
    }
}
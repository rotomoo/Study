package programmers2;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.LinkedList;
import java.util.Queue;

class NaverSolution1 {

    private boolean qPossible(Queue<Integer> queue, int budget) {
        for (int money : queue) {
            budget += money;
            if (budget<0) return false;
        }
        return true;
    }

    public int solution(int[] A) {
        // write your code in Java SE 11
        Queue<Integer> queue = new LinkedList<>();
        int cycle = 0;

        for (int num : A) {
            queue.add(num);
        }

        int budget = 0;
        while (!queue.isEmpty()) {
            if (qPossible(queue, budget)) return cycle;
            int poll = queue.poll();
            if (poll >= 0) budget += poll;
            else {
                queue.add(poll);
                cycle++;
            }
        }

        return cycle;
    }
}
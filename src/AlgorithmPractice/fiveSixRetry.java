package AlgorithmPractice;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class fiveSixRetry {

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) queue.offer(i);
        while (queue.size()!=1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        answer=queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        fiveSixRetry T = new fiveSixRetry();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.print(T.solution(n, m));
    }
}
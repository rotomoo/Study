package AlgorithmPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fiveSeven {

    public String solution(String need,String edus) {
        String answer="YES";
        Queue<Character> queue = new LinkedList<>();
        for (char x : need.toCharArray()) queue.offer(x);
        for (char x : edus.toCharArray()) {
            if (queue.contains(x)) {
                if (x!=queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        fiveSeven T = new fiveSeven();
        Scanner scanner = new Scanner(System.in);
        String need = scanner.next();
        String edus = scanner.next();
        System.out.print(T.solution(need, edus));
    }
}

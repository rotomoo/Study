package programmers;

import java.util.ArrayList;
import java.util.Stack;

class CacheMemory {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for (String x : cities) {
            String tmp = x.toUpperCase();
            if (stack.contains(tmp)) {
                answer ++;
                stack.removeElement(tmp);
                stack.push(tmp);
            } else {
                answer += 5;
                stack.push(tmp);
            }
            if (stack.size() > cacheSize) {
                stack.remove(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, new String[] {"jeju", "Jeju"}));
    }
}
package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class CacheMemory {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            if (q.size() == cacheSize + 1) {
                q.poll();
            }
            if (q.contains(city)) {
                answer++;
                q.remove(city);
                q.offer(city);
            }
            else {
                answer+=5;
                q.offer(city);
            }
        }
        return answer;
    }

//    public static int solution(int cacheSize, String[] cities) {
//        int answer = 0;
//        Stack<String> stack = new Stack<>();
//        for (String x : cities) {
//            String tmp = x.toUpperCase();
//            if (stack.contains(tmp)) {
//                answer ++;
//                stack.removeElement(tmp);
//                stack.push(tmp);
//            } else {
//                answer += 5;
//                stack.push(tmp);
//            }
//            if (stack.size() > cacheSize) {
//                stack.remove(0);
//            }
//        }
//        return answer;
//    }
}
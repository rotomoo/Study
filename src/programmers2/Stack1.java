package programmers2;

import java.util.LinkedList;
import java.util.Queue;

class Stack1 {
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
}
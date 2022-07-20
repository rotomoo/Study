package etc;

import java.util.*;

public class Lv1_12 {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int number : arr) {
            if (!stack.isEmpty() && stack.peek() == number) continue;
            stack.push(number);
        }
        for (Integer integer : stack) {
            answer.add(integer);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
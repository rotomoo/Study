package programmers;

import java.util.Stack;

class Mvp {
    public static int[] solution(String[] arr) {
        int[] answer= new int[5];
        Stack<Integer> stack = new Stack<>();
        int[] monthArr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i=0; i<365; i++) {
            stack.push(0);
        }
        for (String x: arr) {
            String[] strArr = x.split(" ");
            int score = Integer.parseInt(strArr[1]);
            String[] time = strArr[0].split("/");
            int month = Integer.parseInt(time[1]);
            int during = 30;
            System.out.println("during = " + during);
            int start = monthArr[month - 1] + Integer.parseInt(time[2]) - 1;
            System.out.println("start = " + start);
            for (int i = start; i< during + start; i++) {
                stack.set(i, stack.elementAt(i)+score);
            }
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (pop < 10000) {
                answer[0]++;
            }
            else if (pop < 20000) {
                answer[1]++;
            }
            else if (pop < 50000) {
                answer[2]++;
            }
            else if (pop < 100000) {
                answer[3]++;
            } else answer[4]++;
        }
        for (int x : answer) System.out.print(x +" ");
        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(new String[]{"2019/01/01 5000", "2019/01/20 15000", "2019/02/09 90000"}));
    }
}

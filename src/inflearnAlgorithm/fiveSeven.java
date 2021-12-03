package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class fiveSeven {
    public String solution(String str1, String str2) {
        String answer="YES";
        Queue<Character> queue= new LinkedList<>();
        for (char x : str1.toCharArray()) queue.offer(x);
        for (char x : str2.toCharArray()) {
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
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(T.solution(str1,str2));
    }
}
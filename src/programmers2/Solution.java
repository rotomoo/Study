package programmers2;

import java.util.HashSet;

class Solution {
    static String Numbers;
    static int[] cb, ch;
    static HashSet<Integer> set = new HashSet<>();

    public static boolean isCheck(int tmp) {
        if (tmp==0 || tmp==1) return false;
        for (int i = 2; i <= Math.sqrt(tmp); i++) {
            if (tmp%i==0) return false;
        }
        return true;
    }

    public static void DFS(int L, int s, int end) {
        if (L == end) {
            StringBuilder sb = new StringBuilder();
            for (int x : cb) sb.append(x);
            set.add(Integer.parseInt(sb.toString()));
            return;
        }
        for (int i = 0; i < Numbers.length(); i++) {
            if (ch[i] == 0) {
                ch[i]=1;
                cb[L]=Numbers.charAt(i)-'0';
                DFS(L+1, i+1, end);
                ch[i]=0;
            }
        }
    }

    public static int solution(String numbers) {
        int answer = 0;
        Numbers = numbers;
        ch = new int[Numbers.length()];
        for (int i = 0; i < Numbers.length(); i++) {
            cb = new int[i+1];
            DFS(0, 0, i+1);
        }
        for (int x : set) {
            if (isCheck(x)) answer++;
        }
        return answer;
    }
}
package InflearnAlgorithm;

import java.util.Scanner;

class threeFive {
    public int solution(int n) {
        int answer=0, max=0, lt=1, len=n/2+1;
        for (int i=1; i<=len; i++) {
            max += i;
            if (max==n) answer++;
            while (max>=n) {
                max-=lt;
                lt++;
                if (max==n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        threeFive T = new threeFive();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.print(T.solution(n));
    }
}
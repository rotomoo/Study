package InflearnAlgorithm;

import java.util.Scanner;

public class threeFiveTwo {

    public int solution(int n) {
        int answer = 0;
        int cnt=1;
        n--;
        while (n>0) {
            cnt++;
            n-=cnt;
            if (n%cnt==0) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        threeFiveTwo T = new threeFiveTwo();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            System.out.print(T.solution(n));
    }
}
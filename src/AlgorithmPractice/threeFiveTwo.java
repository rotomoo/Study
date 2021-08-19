package AlgorithmPractice;

import java.util.Scanner;

public class threeFiveTwo {

    public int solution(int countNumber) {
        int answer = 0;
        int cnt=1;
        countNumber--;
        while (countNumber>0) {
            cnt++;
            countNumber-=cnt;
            if (countNumber%cnt==0) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        threeFiveTwo T = new threeFiveTwo();
        Scanner scanner = new Scanner(System.in);
        int countNumber = scanner.nextInt();
            System.out.print(T.solution(countNumber));
    }
}
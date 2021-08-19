package AlgorithmPractice;

import java.util.Scanner;

public class threeFive {

    public int solution(int countNumber) {
        int answer = 0;
        int lt= 0;
        int result =0;
        int m = countNumber/2+1;
        int[] intergerArray = new int[m];
        for (int count=0; count<m; count++) {
            intergerArray[count]=count+1;
            result+=intergerArray[count];
            if (result==countNumber) {
                answer++;
            } while (result>=countNumber) {
                result-=intergerArray[lt++];
                if (result==countNumber) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        threeFive T = new threeFive();
        Scanner scanner = new Scanner(System.in);
        int countNumber = scanner.nextInt();
            System.out.print(T.solution(countNumber));
    }
}
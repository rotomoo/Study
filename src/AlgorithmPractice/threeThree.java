package AlgorithmPractice;

import java.util.Scanner;

public class threeThree {

    public int solution(int day, int sales, int[] salesArr) {
        int answer = 0;
        int result = 0;
        for (int salesOfDay=0 ;salesOfDay<sales; salesOfDay++) {
            result+= salesArr[salesOfDay];
        }
        for (int salesOfDay=sales ;salesOfDay<day; salesOfDay++) {
            result+= salesArr[salesOfDay] - salesArr[salesOfDay-sales];
            answer=Math.max(result,answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        threeThree T = new threeThree();
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int sales = scanner.nextInt();
        int[] salesArr = new int[day];
        for (int i = 0; i < day; i++) {
            salesArr[i] = scanner.nextInt();
        }
            System.out.print(T.solution(day, sales, salesArr));
    }
}
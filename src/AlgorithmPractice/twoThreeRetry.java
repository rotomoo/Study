package AlgorithmPractice;

import java.util.Scanner;

public class twoThreeRetry {

    public String solution(int num, int[] numArr, int[] numArr2) {
        String answer="";
            for (int i=0; i<num; i++) {
                if (numArr[i] == numArr2[i]) {
                    answer+="D";
                }
                else if (numArr[i]==1 && numArr2[i]==3) {
                    answer+="A";
                }
                else if (numArr[i]==2 && numArr2[i]==1) {
                    answer+="A";
                }
                else if (numArr[i]==3 && numArr2[i]==2) {
                    answer+="A";
                }
                else {
                    answer += "B";
                }
            }
        return answer;
    }

    public static void main(String[] args) {
        twoThreeRetry T = new twoThreeRetry();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        int[] numArr2 = new int[num];
        for (int i =0; i<num; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int i =0; i<num; i++) {
            numArr2[i] = scanner.nextInt();
        }
        for (char x : T.solution(num, numArr, numArr2).toCharArray()) {
            System.out.println(x);
        }
    }
}

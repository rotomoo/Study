package AlgorithmPractice;

import java.util.Scanner;

public class twoThree {

    public String solution(int num, int[] numX,int[] numY) {
        String answer="";
        for (int i=0;i<num;i++) {
            if (numX[i]==numY[i]) {
                answer+="D";
            } else if (numX[i] ==1 && numY[i]==3) {
                answer+="A";
            } else if (numX[i] ==2 && numY[i]==1) {
                answer+="A";
            } else if (numX[i] ==3 && numY[i]==2) {
                answer+="A";
            } else {
                answer+="B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoThree T = new twoThree();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numX = new int[num];
        int[] numY = new int[num];
        for (int i=0; i<num; i++) {
            numX[i] = scanner.nextInt();
        }
        for (int i=0; i<num; i++) {
            numY[i] = scanner.nextInt();
        }
        for (char x : T.solution(num, numX, numY).toCharArray()) {
            System.out.println(x);
        }
    }
}

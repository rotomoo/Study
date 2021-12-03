package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

class twoSixRetry {

    public boolean isPrime(int num) {
        if(num==1) return false;
        for (int i=2; i<num; i++) {
            if (num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int num, int[] numArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String int_to_str = Integer.toString(numArr[i]);
            StringBuilder sb = new StringBuilder(int_to_str);
            sb.reverse().toString();
            int test = Integer.parseInt(String.valueOf(sb));
            if (isPrime(test)){
                answer.add(test);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoSixRetry T = new twoSixRetry();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int x : T.solution(num, numArr)) {
            System.out.print(x+" ");
        }
    }
}

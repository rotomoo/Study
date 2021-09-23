package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

class twoSix {

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
            int tmp=numArr[i];
            int res=0;
            while (tmp>0) {
                res= res*10+tmp%10;
                tmp= tmp/10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoSix T = new twoSix();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i <num; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int x : T.solution(num, numArr)) {
            System.out.print(x+" ");
        }
    }
}

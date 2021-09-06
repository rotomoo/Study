package AlgorithmPractice;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class fourFive {

    public int solution(int allNumber, int bigNumber, int[] array) {
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int fitstCard=0; fitstCard<allNumber; fitstCard++) {
            for (int secondCard=fitstCard+1; secondCard<allNumber; secondCard++) {
                for (int thirdCard=secondCard+1; thirdCard<allNumber; thirdCard++) {
                    Tset.add(array[fitstCard]+array[secondCard]+array[thirdCard]);
                }
            }
        }
        int cnt=0;
        //System.out.println(Tset.first());
        for (int x : Tset) {
            cnt++;
            if (cnt==bigNumber) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        fourFive T = new fourFive();
        Scanner scanner = new Scanner(System.in);
        int allNumber = scanner.nextInt();
        int bigNumber= scanner.nextInt();
        int[] array = new int[allNumber];
        for (int i=0; i<allNumber; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print(T.solution(allNumber, bigNumber, array));
    }
}

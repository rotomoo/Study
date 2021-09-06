package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class oneFourTwo {

    public ArrayList<String> solution(int n, String[] inputString) {
        ArrayList<String> answer=new ArrayList<>();
        for (String x : inputString) {
            char[] s = x.toCharArray();
            int[] t = new int[3];
            int lt=0;
            int rt=x.length()-1;
            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        oneFourTwo T = new oneFourTwo();
        Scanner scanner = new Scanner(System.in);
        int inputN = scanner.nextInt();
        String[] inputString = new String[inputN];
        for (int i = 0; i<inputN; i++) {
            inputString[i] = scanner.next();
        }
        for (String x : T.solution(inputN, inputString)) {
            System.out.println(x);
        }
    }
}

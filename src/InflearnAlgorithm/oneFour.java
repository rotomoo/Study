package InflearnAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class oneFour {

    public ArrayList<String> solution(int n, String[] inputString) {
        ArrayList<String> answer=new ArrayList<>();
        for (String x : inputString) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        oneFour T = new oneFour();
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

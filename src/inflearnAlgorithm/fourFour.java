package InflearnAlgorithm;

import java.util.HashMap;
import java.util.Scanner;

public class fourFour {

    public int solution(String str, String str2) {
        int answer=0;
        HashMap<Character,Integer> strM = new HashMap<>();
        HashMap<Character,Integer> str2M = new HashMap<>();
        for (char key : str2.toCharArray()) str2M.put(key, str2M.getOrDefault(key,0)+1);
        for (int turn=0; turn<str2.length()-1; turn++) {
            strM.put(str.charAt(turn), strM.getOrDefault(str.charAt(turn),0)+1);
        }
        int left = 0;
        for (int right=str2.length()-1; right<str.length(); right++) {
            strM.put(str.charAt(right), strM.getOrDefault(str.charAt(right),0)+1);
            if (strM.equals(str2M)) answer++;
            strM.put(str.charAt(left), strM.get(str.charAt(left))-1);
            if (strM.get(str.charAt(left))==0) strM.remove(str.charAt(left));
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        fourFour T = new fourFour();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.next();
        System.out.print(T.solution(str, str2));
    }
}

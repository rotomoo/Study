package AlgorithmPractice;

import java.util.HashMap;
import java.util.Scanner;

class fourTwoTwo {
    public String solution(String str, String str2) {
        String answer="YES";
        HashMap<Character,Integer> map =new HashMap<>();
        HashMap<Character,Integer> map2 =new HashMap<>();
        for (char x : str.toCharArray()) map.put(x, map.getOrDefault(x, 0)+1);
        for (char x : str2.toCharArray()) map2.put(x, map2.getOrDefault(x, 0)+1);
        for (char key : map.keySet()) {
            System.out.println(map.get(key) + " "+ map2.get(key));
            if (map.get(key)!=map2.get(key)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        fourTwoTwo T = new fourTwoTwo();
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        String str2 = scanner.next();
        System.out.println(T.solution(str,str2));
    }
}
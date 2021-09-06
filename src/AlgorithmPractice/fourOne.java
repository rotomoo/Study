package AlgorithmPractice;

import java.util.HashMap;
import java.util.Scanner;

public class fourOne {

    public char solution(String str) {
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        //System.out.println(map.containsKey('A'));
        //System.out.println(map.size());
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            //System.out.println(key+" "+map.get(key));
            if (map.get(key)>max) {
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        fourOne T = new fourOne();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}

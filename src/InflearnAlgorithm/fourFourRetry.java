package InflearnAlgorithm;

import java.util.HashMap;
import java.util.Scanner;

class fourFourRetry {
    public int solution(String str, String str2) {
        int answer=0, lt=0, rt=0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x,0)+1);
        }
        for (; rt<str2.length(); rt++) {
            map.put(str.charAt(rt), map.getOrDefault(str.charAt(rt),0)+1);
            if (map.equals(map2)) answer++;
        }
        for (rt=str2.length(); rt<str.length(); rt++) {
            map.put(str.charAt(lt),map.get(str.charAt(lt))-1);
            map.put(str.charAt(rt),map.getOrDefault(str.charAt(rt),0)+1);
            if (map.get(str.charAt(lt))==0) map.remove(str.charAt(lt));
            if (map.equals(map2)) answer++;
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        fourFourRetry T = new fourFourRetry();
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        String str2= scanner.next();
        System.out.println(T.solution(str, str2));
    }
}
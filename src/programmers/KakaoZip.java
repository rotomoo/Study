package programmers;

import java.util.ArrayList;
import java.util.HashMap;

class KakaoZip {
    public static int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf((char)(i + 64)), i);
        }
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put("C", 3);
//        map.put("D", 4);
//        map.put("E", 5);
//        map.put("F", 6);
//        map.put("G", 7);
//        map.put("H", 8);
//        map.put("I", 9);
//        map.put("J", 10);
//        map.put("K", 11);
//        map.put("L", 12);
//        map.put("M", 13);
//        map.put("N", 14);
//        map.put("O", 15);
//        map.put("P", 16);
//        map.put("Q", 17);
//        map.put("R", 18);
//        map.put("S", 19);
//        map.put("T", 20);
//        map.put("U", 21);
//        map.put("V", 22);
//        map.put("W", 23);
//        map.put("X", 24);
//        map.put("Y", 25);
//        map.put("Z", 26);
        int cnt =27;
        String tmp = "";
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < msg.length(); i++) {
            tmp += msg.charAt(i);
            if (i + 1 < msg.length() && !map.containsKey(tmp + msg.charAt(i + 1))) {
                answer.add(map.get(tmp));
                map.put(tmp + msg.charAt(i + 1), cnt++);
                tmp = "";
            }
        }
        answer.add(map.get(tmp));
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
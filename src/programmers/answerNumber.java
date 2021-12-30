package programmers;

import java.util.HashMap;

public class answerNumber {
    public static int solution(String s) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        String tmp="";
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                tmp+=x;
                if (map.containsKey(tmp)) {
                    answer+=map.get(tmp);
                    tmp="";
                }
            }
            else {
                answer+=x;
                tmp="";
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}

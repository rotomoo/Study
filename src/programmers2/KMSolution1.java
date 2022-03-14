package programmers2;

import java.util.HashMap;

class KMSolution1 {

    public String solution(String S, String C) {
        String answer = "";
        C = C.toLowerCase();
        String[] split = S.split(", ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : split) {
            answer += x + " <";
            String[] sarr = x.split(" ");
            char first = ' ';
            char middle = ' ';
            String last = "";
            if (sarr.length > 2) {
                first = Character.toLowerCase(sarr[0].charAt(0));
                middle = Character.toLowerCase(sarr[1].charAt(0));
                sarr[2] = sarr[2].replace("-", "");
                if (sarr[2].length()>8) last = sarr[2].toLowerCase().substring(0, 8);
                else last = sarr[2].toLowerCase();
            }
            else {
                first = Character.toLowerCase(sarr[0].charAt(0));
                if (sarr[1].length()>8) last = sarr[1].toLowerCase().substring(0, 8);
                else last = sarr[1].toLowerCase();
            }
            String email = "";
            email += first;
            if (middle != ' ') email += middle;
            email += last;
            map.put(email, map.getOrDefault(email, 0) + 1);
            if (map.get(email) > 1) answer += email + map.get(email)+ "@" + C + ".com>, ";
            else answer += email + "@" + C + ".com>, ";
        }
        answer = answer.substring(0, answer.length()-2);
        return answer;
    }

    public static void main(String[] args) {

    }
}

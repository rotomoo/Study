package programmers2;

import java.util.HashMap;

class KSolution1 {
    static HashMap<Character, Integer> map = new HashMap<>();
    static String answer;

    public static void calc(String indicators) {
        int first = map.get(indicators.charAt(0));
        int second = map.get(indicators.charAt(1));
        if (first >= second) answer += indicators.charAt(0);
        else answer += indicators.charAt(1);
    }

    public String solution(String[] survey, int[] choices) {
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        for (int i = 0; i < choices.length; i++) {
            String curSurvey = survey[i];
            char prev = curSurvey.charAt(0);
            char next = curSurvey.charAt(1);
            if (choices[i] == 1) {
                map.put(prev, map.get(prev) + 3);
            } else if (choices[i] == 2) {
                map.put(prev, map.get(prev) + 2);
            } else if (choices[i] == 3) {
                map.put(prev, map.get(prev) + 1);
            } else if (choices[i] == 5) {
                map.put(next, map.get(next) + 1);
            } else if (choices[i] == 6) {
                map.put(next, map.get(next) + 2);
            } else if (choices[i] == 7) {
                map.put(next, map.get(next) + 3);
            }
        }
        answer = "";

        String[] indicators = {"RT", "CF", "JM", "AN"};

        for (int i = 0; i < 4; i++) {
            calc(indicators[i]);
        }
        return answer;
    }
}
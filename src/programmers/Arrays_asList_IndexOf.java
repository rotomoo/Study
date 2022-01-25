package programmers;

import java.util.Arrays;

class Arrays_asList_IndexOf {
    public String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ x + "에 있다";
    }
}
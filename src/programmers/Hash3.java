package programmers;

import java.io.IOException;
import java.util.HashMap;

public class Hash3 {

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0; i< clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        for (int x : map.values()) {
            answer*=(x+1);
        }
        return answer-1;
    }

    public static void main(String[] args) throws IOException {
        String[][] clothes = {{"yh","face"}};
        System.out.println(solution(clothes));
    }
}

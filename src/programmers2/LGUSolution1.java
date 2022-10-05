package programmers2;

import java.util.*;

class LGUSolution1 {
    public int solution(int[] arr) {
        HashSet<HashMap<Integer, Integer>> answer = new HashSet<>();
        for (int number : arr) {
            HashMap<Integer, Integer> anagramMap = new LinkedHashMap<>();
            int[] numberArr = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
            for (int num : numberArr) {
                anagramMap.put(num, anagramMap.getOrDefault(num, 0) + 1);
            }
            if (answer.contains(anagramMap)) continue;
            answer.add(anagramMap);
        }
        return answer.size();
    }
}
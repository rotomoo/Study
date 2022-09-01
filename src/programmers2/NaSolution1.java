package programmers2;

import java.util.HashMap;

class NaSolution1 {
    public static int solution(int[] T) {
        // write your code in Java SE 11
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : T) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int requiredLen = T.length / 2;

        for (int key : map.keySet()) {
            if (requiredLen <= 0) break;
            int numSize = map.get(key);
            if (numSize > 1) {
                requiredLen -= numSize - 1;
                map.put(key, 1);
            }
        }

        // all map.get(key) == 1
        int answer = requiredLen <= 0 ? map.size() : map.size() - requiredLen;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,1,1,1}));
    }
}

package programmers3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

class NexSolution2 {

    private static HashMap<Character,Integer> countedMap(String string) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : string.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    private static boolean sourceContainsTarget(HashMap<Character, Integer> sourceMap, HashMap<Character, Integer> targetMap,
            String source, String target) {
        String tmp = "";
        source = source.replace("-", "");
        System.out.println("source = " + source);
        int idx = 0;
        for (char c : source.toCharArray()) {
            if (target.contains(String.valueOf(c))) {
                if (idx == target.length()-1) break;
                tmp += target.charAt(idx);
                idx ++;
            }
        }
        System.out.println("tmp = " + tmp);
        if (!tmp.contains(target)) return true;
        for (Character targetChar : targetMap.keySet()) {
            if (sourceMap.get(targetChar) < targetMap.get(targetChar)) return true;
        }
        return false;
    }

    private static void calculateOrder(int idx, List<Integer> order, HashMap<Character, Integer> sourceMap, String source) {
        int index = order.get(idx) - 1;
        char c = source.charAt(index);
        sourceMap.put(c, sourceMap.get(c) - 1);
    }

    public static int getMaximumRemovals(List<Integer> order, String source, String target) {
        // Write your code here
        HashMap<Character, Integer> sourceMap = countedMap(source);
        HashMap<Character, Integer> targetMap = countedMap(target);
        int cnt = 0;
        while (true) {
            calculateOrder(cnt, order, sourceMap, source);
            int index = order.get(cnt) - 1;
            source = source.substring(0, index) + "-" + source.substring(index + 1);
            if (sourceContainsTarget(sourceMap, targetMap, source, target)) return cnt;
            cnt++;
        }
    }
}
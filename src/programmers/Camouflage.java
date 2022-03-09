package programmers;

import java.util.HashMap;
import java.util.HashSet;

public class Camouflage {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] x : clothes) {
            map.put(x[1], map.getOrDefault(x[1], 0) + 1);
        }
        for (int x : map.values()) {
            answer *= (x+1);
        }
        return answer - 1;
    }

//    public int solution(String[][] clothes) {
//        HashMap<String, HashSet<String>> map = new HashMap<>();
//        for (String[] x : clothes) {
//            HashSet<String> tmp = map.getOrDefault(x[1], new HashSet<>());
//            tmp.add(x[0]);
//            map.put(x[1], tmp);
//        }
//        System.out.println(map);
//        int tmp = 1;
//        for (HashSet<String> val : map.values()) {
//            tmp *= val.size() + 1;
//        }
//        return tmp-1;
//    }

//    public static int solution(String[][] clothes) {
//        int answer = 1;
//        HashMap<String,Integer> map = new HashMap<>();
//        for (int i=0; i< clothes.length; i++) {
//            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
//        }
//        for (int x : map.values()) {
//            answer*=(x+1);
//        }
//        return answer-1;
//    }
//
//    public static void main(String[] args) throws IOException {
//        String[][] clothes = {{"yh","face"}};
//        System.out.println(solution(clothes));
//    }
}

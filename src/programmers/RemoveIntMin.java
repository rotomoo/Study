package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class RemoveIntMin {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int asInt = Arrays.stream(arr).min().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (x==asInt) continue;
            list.add(x);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

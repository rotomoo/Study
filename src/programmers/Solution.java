package programmers;

import java.util.HashMap;

class Solution {

    public static int isCalc(int num) {
        System.out.println(num);
        if (num==1) return -1;
        if (num%3==0) {
            return num / 3;
        }
        else if (num%3==2) {
            return num / 3 + 1;
        }
        else return isCalc(num - 3) + 1;
    }

    public int solution(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        System.out.println(map);
        int answer = 0;
        for (int key : map.keySet()) {
            int size = map.get(key);
            int cnt = isCalc(size);
            if (cnt==-1) return -1;
            else answer += cnt;
        }
        return answer;
    }
}
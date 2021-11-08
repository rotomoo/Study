package programmers;


import java.util.HashMap;

class Solution1 {
    public int[] solution(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if (!map.containsKey(1)) map.put(1,0);
        if (!map.containsKey(2)) map.put(2,0);
        if (!map.containsKey(3)) map.put(3,0);
        int max=Integer.MIN_VALUE;
        for (int x : map.keySet()) {
            max = Math.max(max,map.get(x));
        }
        int[] tmp=new int[4];
        for (int i=1; i<=3; i++) {
            tmp[i]=map.get(i);
        }
        int[] answer = new int[3];
        for (int i=1; i<=3; i++) {
            answer[i-1]=max-tmp[i];
        }
        return answer;
    }
}

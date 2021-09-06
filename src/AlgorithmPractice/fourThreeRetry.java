package AlgorithmPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fourThreeRetry {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt=0, rt=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for( ; rt<k; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
        }
        answer.add(map.size());
        for (rt=k; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            map.put(arr[lt], map.get(arr[lt])-1);
            if (map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
            answer.add(map.size());
        }
        return answer;
    }

    public static void main(String[] args) {
        fourThreeRetry T = new fourThreeRetry();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n,k,arr)) System.out.print(x+" ");
    }
}
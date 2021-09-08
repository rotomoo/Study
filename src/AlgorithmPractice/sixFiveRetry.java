package AlgorithmPractice;

import java.util.Scanner;
import java.util.HashMap;

class sixFiveRetry {
    public char solution(int[] arr) {
        char answer='U';
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if (map.get(x)>1) return 'D';
        }
        return answer;
    }

    public static void main(String[] args) {
        sixFiveRetry T = new sixFiveRetry();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
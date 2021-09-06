package AlgorithmPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fourThree {

    public ArrayList<Integer> solution(int n,int k, int[] arr) {
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int left=0;
        for (int right=k-1; right<n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            answer.add(map.size());
            map.put(arr[left],map.get(arr[left])-1);
            if (map.get(arr[left])==0) map.remove(arr[left]);
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        fourThree T = new fourThree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, k, arr))
        System.out.print(x+" ");
    }
}

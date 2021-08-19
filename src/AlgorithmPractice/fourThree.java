package AlgorithmPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fourThree {

    public ArrayList<Integer> solution(int day,int sales, int[] array) {
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int first=0; first<sales-1; first++) {
            map.put(array[first], map.getOrDefault(array[first], 0)+1);
        }
        int left=0;
        for (int right=sales-1; right<day; right++) {
            map.put(array[right], map.getOrDefault(array[right], 0)+1);
            answer.add(map.size());
            map.put(array[left],map.get(array[left])-1);
            if (map.get(array[left])==0) map.remove(array[left]);
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        fourThree T = new fourThree();
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int sales = scanner.nextInt();
        int[] array = new int[day];
        for (int i=0; i<day; i++) {
            array[i] = scanner.nextInt();
        }
        for (int x : T.solution(day, sales, array))
        System.out.print(x+" ");
    }
}

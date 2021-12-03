package programmers;

import java.util.*;

public class LSolution1 {
    public int[] solution(String[] record) {
        ArrayList<String[]> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for (int i=0; i<record.length; i++) {
            list.add(record[i].split(" "));
        }
        int[] answer = new int[2];
        for(String[] x : list) {
            if (x[0].startsWith("P")) {
                for (int i=0; i<Integer.parseInt(x[2]); i++) {
                    q.offer(Integer.parseInt(x[1]));
                    s.push(Integer.parseInt(x[1]));
                }
            }
            else {
                int tmp=Integer.parseInt(x[2]);
                while (tmp>0) {
                    answer[0]+=q.poll();
                    answer[1]+=s.pop();
                    tmp--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        LSolution1 T = new LSolution1();
        String[] record={"P 300 6", "P 500 3", "S 1000 4", "P 600 2", "S 1200 1"};
        System.out.println(T.solution(record));
    }
}

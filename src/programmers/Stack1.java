package programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Stack1 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<progresses.length; i++) {
            int tmp=0;
            if ((100-progresses[i])%speeds[i]==0) tmp=(100-progresses[i])/speeds[i];
            else tmp=(100-progresses[i])/speeds[i]+1;
            for (int j=0; j<progresses.length; j++) {
                progresses[j]+=speeds[j]*tmp;
                System.out.println("j"+j+" "+progresses[j]);
            }
            while (i<progresses.length && progresses[i]>=100) {
                q.offer(progresses[i++]);
            }
            i--;
            int cnt=0;
            while (!q.isEmpty()) {
                q.poll();
                cnt++;
            }
            list.add(cnt);
        }
        answer= list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[] progresses={95,90,99,99,80,99};
        int[] speeds={1,1,1,1,1,1};
        System.out.println(solution(progresses,speeds));
    }
}

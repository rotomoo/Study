package programmers;

import java.util.Arrays;

public class dSolution2 {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long lt=times[0];
        long rt=n*times[times.length-1];
        while (lt<=rt) {
            long mid=(lt+rt)/2;
            long cnt=0;
            for (int i=0; i<times.length; i++) cnt+=mid/times[i];
            if (cnt>=n) {
                answer=mid;
                rt=mid-1;
            }
            else lt=mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        dSolution2 T = new dSolution2();
    }
}

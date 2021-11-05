package programmers;

public class for1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt=0, cnt2=0;
        for (int i=0; i<6; i++) {
            int tmp=lottos[i];
            if(tmp==0) {
                cnt2++;
                continue;
            }
            for (int j=0; j<6; j++) {
                if(tmp==win_nums[j]) cnt++;
            }
        }
        int[] answer = new int[2];
        answer[0]=7-cnt-cnt2;
        answer[1]=7-cnt;
        if(answer[0]==7) answer[0]=6;
        if(answer[1]==7) answer[1]=6;
        return answer;
    }

    public static void main(String[] args) {
        for1 T = new for1();
        int[] lottos={44,1,0,0,31,25};
        int[] win_nums={31,10,45,1,6,19};
        System.out.println(T.solution(lottos,win_nums));
    }
}

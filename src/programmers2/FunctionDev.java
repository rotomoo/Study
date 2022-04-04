package programmers2;

import java.util.ArrayList;

class FunctionDev {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < progresses.length; i++) {
            if (progresses[i] >= 100) {
                cnt++;
                continue;
            }
            else {
                if (cnt!=0) {
                    answer.add(cnt);
                    cnt=0;
                }
            }
            if (progresses[i] < 100) {
                int needDay = (100 - progresses[i]) / speeds[i];
                needDay = (100 - progresses[i]) % speeds[i] == 0 ? needDay : needDay + 1;
                for (int j = i; j < progresses.length; j++) {
                    progresses[j] += (needDay * speeds[j]);
                }
            }
            cnt++;
        }
        if (cnt!=0) answer.add(cnt);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
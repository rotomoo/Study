package programmers;

import java.util.Arrays;

class SKISolution2 {

    public boolean isVip(int period, int payment) {
        if (payment >= 900000 && period >= 24) return true;
        else if (payment >= 600000 && period >= 60) return true;
        return false;
    }

    public int calcPayment(int[] payments) {
        return Arrays.stream(payments).sum();
    }

    public int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = new int[2];
        for (int i = 0; i < periods.length; i++) {
            int curPeriod = periods[i];
            int curPayment = calcPayment(payments[i]);
            int nextPayment = curPayment - payments[i][0] + estimates[i];

            // 이번달 vip X, 다음달 vip
            if (!isVip(curPeriod, curPayment) && isVip(curPeriod+1, nextPayment)) answer[0]++;

            // 이번달 vip, 다음달 vip X
            if (isVip(curPeriod, curPayment) && !isVip(curPeriod+1, nextPayment)) answer[1]++;
        }
        return answer;
    }
}
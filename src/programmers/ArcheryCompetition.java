package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArcheryCompetition {

    static class Point {
        int point, cnt;

        public Point(int point, int cnt) {
            this.point = point;
            this.cnt = cnt;
        }
    }

    static class AnswerCheck {
        int difference;
        int[] ryan;

        public AnswerCheck(int difference, int[] ryan) {
            this.difference = difference;
            this.ryan = ryan;
        }
    }

    static List<AnswerCheck> answer;

    public static void DFS(int cnt, int n, int s, Point[] apeach, Point[] ryan) {
        if (cnt == n) {
            calc(apeach, ryan);
            return;
        }
        for (int i = s; i < 11; i++) {
            ryan[i].cnt++;
            DFS(cnt+1, n, i, apeach, ryan);
            ryan[i].cnt--;
        }
    }

    public static void calc(Point[] apeach, Point[] ryan) {
        int aPoint = 0;
        int rPoint = 0;
        for (int i = 0; i < 11; i++) {
            if (apeach[i].cnt == 0 && ryan[i].cnt ==0) continue;
            if (apeach[i].cnt >= ryan[i].cnt) aPoint += apeach[i].point;
            else rPoint += ryan[i].point;
        }

        if (aPoint >= rPoint) return;

        int curDiff = rPoint - aPoint;

        int[] curRyan = new int[ryan.length];
        for (int i=0; i<ryan.length; i++) {
            curRyan[i] = ryan[i].cnt;
        }


        if (!answer.isEmpty()) {

            AnswerCheck answerCheck = answer.get(0);

            if (answerCheck.difference > curDiff) return;

            else if (answerCheck.difference < curDiff) answer.clear();
        }

        answer.add(new AnswerCheck(curDiff, curRyan));
    }

    public int[] solution(int n, int[] info) {

        answer = new ArrayList<>();

        Point[] ryan = new Point[11];
        Point[] apeach = new Point[11];

        for (int i = 0; i < 11; i++) {
            apeach[i] = new Point(10 - i, info[i]);
            ryan[i] = new Point(10 - i, 0);
        }

        DFS(0, n, 0, apeach, ryan);

        if (answer.isEmpty()) return new int[]{-1};

        Collections.sort(answer, (o1, o2) -> {
            int[] aRyan = o1.ryan;
            int[] bRyan = o2.ryan;
            for (int i = 10; i >= 0; i--) {
                if (aRyan[i] != bRyan[i]) return bRyan[i] - aRyan[i];
            }
            return 0;
        });
        return answer.get(0).ryan;
    }
}
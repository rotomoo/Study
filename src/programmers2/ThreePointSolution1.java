package programmers2;

import java.util.Arrays;

class ThreePointSolution1 {
    static class student {
        int idx, score;

        public student(int idx, int score) {
            this.idx = idx;
            this.score = score;
        }
    }

    public int getScore(String log) {
        int score = 0;
        int lCnt = 0;
        for (char x : log.toCharArray()) {
            if (x=='A') score++;
            else if (x=='L') lCnt++;
            else lCnt += 2;
        }
        if (lCnt >= 6) score = 0;
        else score -= lCnt / 2;
        return score;
    }

    public int[] solution(String[] students) {

        student[] studentArr = new student[students.length];

        int idx = 0;
        for (String student : students) {
            studentArr[idx] = new student(idx, getScore(student));
            idx++;
        }

        Arrays.sort(studentArr, (o1, o2) -> {
            if (o1.score == o2.score) return o1.idx - o2.idx;
            else return o2.score - o1.score;
        });

        int[] answer = new int[students.length];
        for (int i = 0; i < studentArr.length; i++) {
            answer[i] = studentArr[i].idx+1;
        }

        return answer;
    }
}
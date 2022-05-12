package programmers;

class ESolution1 {
    public static int solution(String[] scores) {
        int answer = 0;
        for (String score : scores) {
            // 초기 변수 설정
            int aCnt = 0;
            int fCnt = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            double average = 0;
            int peopleCnt = 0;

            // 계산
            for (char c : score.toCharArray()) {
                peopleCnt++;
                if (c == 'A') aCnt++;
                if (c == 'F') fCnt++;
                int curPnt = Math.abs(c-'F');
                average += curPnt;
                max = Math.max(max, curPnt);
                min = Math.min(min, curPnt);
            }

            // 1번 조건
            if (fCnt >= 2) {
                continue;
            }

            // 2번 조건
            else if (aCnt >= 2) {
                answer++;
                continue;
            }

            // 모두 해당 X
            else {
                peopleCnt -= 2;
                average = average - max - min;
                average /= peopleCnt;
                if (average >=3) answer++;
            }
        }
        return answer;
    }
}
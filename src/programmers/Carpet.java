package programmers;

class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int s = brown + yellow;
        for (int i = 3; i < s; i++) {
            if (s%i!=0) continue;
            int x = i;
            int y = s / i;
            if (x<y) continue;
            if ((x - 2) * (y - 2) == yellow) {
                answer[0]=x;
                answer[1]=y;
                break;
            }
        }
        return answer;
    }
}
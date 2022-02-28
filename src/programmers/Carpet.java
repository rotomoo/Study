package programmers;

class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 3; i < sum; i++) {
            if (sum % i == 0) {
                int width = i;
                int length = sum / i;
                if (length > width) continue;
                if ((width-2) * (length-2) == yellow) {
                    answer[0] = width;
                    answer[1] = length;
                    break;
                }
            }
        }
        return answer;
    }
}
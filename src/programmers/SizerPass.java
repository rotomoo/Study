package programmers;

class SizerPass {
    public String solution(String s, int n) {
        String answer = "";
        for (char x : s.toCharArray()) {
            int tmp = (int)x;
            if (tmp==32) {
                answer += ' ';
                continue;
            }
            if ((tmp < 91 && tmp + n > 90) || (tmp < 123 && tmp + n > 122)) tmp -= 26;
            answer += (char)(tmp+n);
        }
        return answer;
    }
}
package programmers;

class StrangeString {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for (char x : s.toCharArray()) {
            if (x == ' ') {
                index = 0;
                answer += ' ';
                continue;
            }
            if (index % 2 == 0) {
                answer += Character.toUpperCase(x);
                index++;
            }
            else {
                answer += Character.toLowerCase(x);
                index++;
            }
        }
        return answer;
    }
}
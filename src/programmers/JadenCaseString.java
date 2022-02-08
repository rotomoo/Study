package programmers;

class JadenCaseString {
//    public String solution(String s) {
//        String answer = "";
//        String[] tmp = s.toLowerCase().split("");
//        boolean flag = true;
//        for (String x : tmp) {
//            answer += flag == true ? x.toUpperCase() : x;
//            flag = x.equals(" ") ? true : false;
//        }
//        return answer;
//    }

    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (idx==0) answer += Character.toUpperCase(s.charAt(i));
            else answer += Character.toLowerCase(s.charAt(i));
            if (s.charAt(i) == ' ') {
                idx = 0;
                continue;
            }
            idx++;
        }
        return answer;
    }
}
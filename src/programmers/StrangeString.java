package programmers;

class StrangeString {
//    public String solution(String s) {
//        String answer = "";
//        int index = 0;
//        for (char x : s.toCharArray()) {
//            if (x == ' ') {
//                index = 0;
//                answer += ' ';
//                continue;
//            }
//            if (index % 2 == 0) {
//                answer += Character.toUpperCase(x);
//                index++;
//            }
//            else {
//                answer += Character.toLowerCase(x);
//                index++;
//            }
//        }
//        return answer;
//    }

    public static String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (tmp[i].equals(" ")) {
                cnt = 0;
                answer += " ";
                continue;
            }
            if (cnt%2==0) answer += tmp[i].toUpperCase();
            else answer += tmp[i].toLowerCase();
            cnt++;
        }
        return answer;
    }
}
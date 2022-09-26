package programmers2;

import java.util.ArrayList;
import java.util.HashMap;

class KaSolution1 {

    public int dateToInt(String date) {
        int dateInt = 0;
        String[] dateArr = date.split("\\.");
        dateInt += Integer.parseInt(dateArr[0]) * 12 * 28;
        dateInt += Integer.parseInt(dateArr[1]) * 28;
        dateInt += Integer.parseInt(dateArr[2]);
        return dateInt;
    }

    public int[] solution(String today, String[] terms, String[] privacies) {


        int todayInt = dateToInt(today);

        HashMap<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] termArr = term.split(" ");
            termsMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int idx = 1;
        for (String privacy : privacies) {
            String[] privacyArr = privacy.split(" ");
            Integer term = termsMap.get(privacyArr[1]) * 28;
            int possiblePrivacyDateInt = dateToInt(privacyArr[0]) + term;
            if (todayInt >= possiblePrivacyDateInt) answer.add(idx);
            idx++;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
package programmers2;

import java.util.Arrays;
import java.util.List;

class DevSolution1 {
    public String solution(String[] registered_list, String new_id) {

        List<String> registeredList = Arrays.asList(registered_list);

        String answer = new_id;
        while (checkDuplicate(new_id, registeredList)) {
            StringBuilder s = new StringBuilder(new_id.replaceAll("[\\d]", ""));
            StringBuilder nString = new StringBuilder(new_id.replaceAll("[^\\d]", ""));
            StringBuilder nStringBuilder = nString.equals("") ? new StringBuilder("0") : new StringBuilder(nString);
            int n = Integer.parseInt(String.valueOf(nStringBuilder));
            n++;
            new_id = s.append(n).toString();
            answer = new_id;
        }
        return answer;
    }

    private boolean checkDuplicate(String new_id, List<String> registeredList) {
        return registeredList.contains(new_id);
    }
}
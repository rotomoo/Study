package programmers;

import java.util.HashMap;
import java.util.HashSet;

class GetResultReport {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> getMailCnt = new HashMap<>();
        HashMap<String, HashSet<String>> reportList = new HashMap<>();
        for (String id: id_list) {
            getMailCnt.put(id, 0);
            reportList.put(id, new HashSet<>());
        }
        for (String x : report) {
            String[] reportTmp = x.split(" ");
            reportList.get(reportTmp[1]).add(reportTmp[0]);
        }
        for (String key : reportList.keySet()) {
            HashSet<String> reporters = reportList.get(key);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    getMailCnt.put(reporter, getMailCnt.get(reporter)+1);
                }
            }
        }
        for (int i=0; i< id_list.length; i++) {
            answer[i] = getMailCnt.get(id_list[i]);
        }
        return answer;
    }
}
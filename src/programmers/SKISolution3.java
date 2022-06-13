package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class SKISolution3 {

    public static HashSet<Integer> makeSet(String[] plan, HashSet<Integer> service) {
        HashSet<Integer> curSet = new HashSet<>();

        for (int j = 1; j < plan.length; j++) {
            service.add(Integer.parseInt(plan[j]));
        }

        for (int deepCopy : service) {
            curSet.add(deepCopy);
        }

        return curSet;
    }

    public static int[] solution(int n, String[] plans, String[] clients) {
        HashMap<Integer, HashSet<Integer>> planMap = new LinkedHashMap<>();
        HashMap<Integer, HashSet<Integer>> clientMap = new LinkedHashMap<>();

        HashSet<Integer> service = new HashSet<>();

        for (int i = 0; i < plans.length; i++) {
            String[] plan = plans[i].split(" ");
            planMap.put(Integer.parseInt(plan[0]), makeSet(plan, service));
        }

        for (int i = 0; i < clients.length; i++) {
            String[] client = clients[i].split(" ");
            clientMap.put(Integer.parseInt(client[0]), makeSet(client, new HashSet<>()));
        }

        int[] answer = new int[clients.length];

        int idx = 0;
        for (int cliKey : clientMap.keySet()) {
            int pIdx = 1;
            for (int planKey : planMap.keySet()) {
                if (planKey >= cliKey && planMap.get(planKey).containsAll(clientMap.get(cliKey))) {
                    answer[idx] = pIdx;
                    break;
                }
                pIdx++;
            }
            idx++;
        }

        return answer;
    }
}
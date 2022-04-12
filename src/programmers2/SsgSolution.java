package programmers2;

import java.util.*;

class SsgSolution {
    public static String[] solution(String[][] friends, String user_id) {
        // 인덱싱을 위한 map 선언
        HashMap<String, Integer> idxMap = new LinkedHashMap<>();
        int idx = 0;
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends[i].length; j++) {
                if (idxMap.containsKey(friends[i][j])) continue;
                idxMap.put(friends[i][j], idx++);
            }
        }

        // edges 초기화
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < idxMap.size(); i++) {
            edges.add(new ArrayList<>());
        }

        // edges 할당
        for (String[] friend : friends) {
            edges.get(idxMap.get(friend[0])).add(idxMap.get(friend[1]));
            edges.get(idxMap.get(friend[1])).add(idxMap.get(friend[0]));
        }

        // mutual friend 체크
        HashMap<Integer, Integer> mutualFriendMap = new HashMap<>();
        ArrayList<Integer> friendList = edges.get(idxMap.get(user_id));
        for (Integer friend : friendList) {
            ArrayList<Integer> mutualFriends = edges.get(friend);
            for (Integer mutualFriend : mutualFriends) {
                // 자기 자신은 이거나, 찾은 mututal frind가 이미 친구라면
                if (mutualFriend == idxMap.get(user_id) || friendList.contains(mutualFriend)) continue;
                mutualFriendMap.put(mutualFriend, mutualFriendMap.getOrDefault(mutualFriend, 0) + 1);
            }
        }
        
        // mutualFriendMap 정렬
        ArrayList<Integer> answerTmp = new ArrayList<>(mutualFriendMap.keySet());
        Collections.sort(answerTmp, (s1,s2)->mutualFriendMap.get(s2)-mutualFriendMap.get(s1));

        // 가장 많은 추천횟수의 idx
        int firstIdx = answerTmp.get(0);

        // mutualFriend 추출
        ArrayList<String> answer = new ArrayList<>();
        for (int nowIdx : answerTmp) {
            // 추천횟수가 낮아졌을경우
            if (mutualFriendMap.get(firstIdx) != mutualFriendMap.get(nowIdx)) break;
            for (String key : idxMap.keySet()) {
                if (idxMap.get(key)==nowIdx) answer.add(key);
            }
        }

        // answer 오름차순 정렬
        Collections.sort(answer);

        return answer.toArray(new String[answer.size()]);
    }
}
package programmers;

import java.util.*;

public class NSolution1 {
    public String[] solution(String[] movie) {
        // movieCountMap 선언
        HashMap<String, Integer> movieCountMap = new HashMap<>();

        // movie 루프 돌면서 저장
        for (String curMovie : movie) {
            movieCountMap.put(curMovie, movieCountMap.getOrDefault(curMovie, 0) + 1);
        }

        // mapSortList 선언
        ArrayList<String> mapSortList = new ArrayList<>(movieCountMap.keySet());

        // sort
        Collections.sort(mapSortList, (o1, o2) -> {
            // 같을경우 사전순
            if (movieCountMap.get(o2) == movieCountMap.get(o1)) return o1.compareTo(o2);
                // 아닐경우 예매순
            else return movieCountMap.get(o2) - movieCountMap.get(o1);
        });

        // List toArray
        return mapSortList.toArray(new String[mapSortList.size()]);
    }
}
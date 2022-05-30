package programmers;

import java.util.HashSet;

class NHNSolution1 {
    static int answer = 0;

    public static void setAdd(int[] curCardArr, HashSet<Integer> curDuplicateSet) {
        for (int card = 0; card < 5; card++) {
            curDuplicateSet.add(curCardArr[card]);
        }
    }

    public boolean isCheck(int round, HashSet<Integer> duplicateSet,
                           HashSet<Integer> duplicateSet1, HashSet<Integer> duplicateSet2, int[][] cards1, int[][] cards2) {
        // 10개 중복
        if (duplicateSet.size()!=10) return true;

        int cnt1 = 0;
        int cnt2 = 0;

        // 2번 조건 check
        for (int card = 0; card < 5; card++) {
            if (!duplicateSet1.add(cards1[round][card])) cnt1++;
            if (!duplicateSet2.add(cards2[round][card])) cnt2++;
        }

        // 이전거와 중복 2개이상
        if (cnt1>=2 || cnt2>=2) {
            return true;
        }

        return false;
    }

    public int solution(int[][] cards1, int[][] cards2) {
        // n번
        int n = cards1.length;

        for (int round = 0; round < n; round++) {
            // 10개 중복 체크 Set, 1플레이어 중복 체크 Set, 2플레이어 중복 체크 Set
            HashSet<Integer> duplicateSet = new HashSet<>();
            HashSet<Integer> duplicateSet1 = new HashSet<>();
            HashSet<Integer> duplicateSet2 = new HashSet<>();

            // 1번 조건 Set
            setAdd(cards1[round], duplicateSet);
            setAdd(cards2[round] ,duplicateSet);

            // 2번 조건 Set, 첫 라운드 제외
            if (round!=0) {
                setAdd(cards1[round - 1], duplicateSet1);
                setAdd(cards2[round - 1], duplicateSet2);
            }

            // 1번, 2번 조건 Check
            if (isCheck(round, duplicateSet, duplicateSet1, duplicateSet2, cards1, cards2)) answer++;

        }
        return answer;
    }
}
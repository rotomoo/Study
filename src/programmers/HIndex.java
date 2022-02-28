package programmers;

import java.util.Arrays;

class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int max = 0;
        for (int i = citations.length-1; i >= 0; i--) {
            int min = Math.min(citations[i], citations.length - i);
            max = Math.max(max, min);
        }
        return max;
    }

//    public int solution(int[] arr) {
//        int answer=0;
//        Arrays.sort(arr);
//        int lt = 0;
//        int rt = arr[arr.length - 1];
//        while (lt <= rt) {
//            int mid = (lt + rt) / 2;
//            int cnt = 0;
//            for (int i=0; i<arr.length; i++) {
//                if (arr[i] >= mid) {
//                    cnt = arr.length - i;
//                    break;
//                }
//            }
//            if (cnt >= mid) {
//                System.out.println(mid);
//                answer = mid;
//                lt = mid + 1;
//            }
//            else rt = mid -1;
//        }
//        return answer;
//    }
}

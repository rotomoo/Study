package programmers;

public class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt=1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]>arr[i-1]) {
                cnt++;
                System.out.println(cnt);
            }
            else if (arr[i-1]>arr[i]) {
                while (cnt>=2) {
                    cnt--;
                    answer++;
                }
                cnt=1;
            }
            else cnt=1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int[] arr={0,1,2,5,3,7};
        System.out.println(T.solution(arr));
    }
}

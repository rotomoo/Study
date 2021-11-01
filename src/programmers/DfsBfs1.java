package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DfsBfs1 {
    static int cnt=0;

    public static void DFS(int L, int sum,int[] numbers,int target) {
        if (L==numbers.length) {
            if (sum==target) {
                cnt++;
            }
        }
        else {
            DFS(L+1,sum+numbers[L],numbers,target);
            DFS(L+1,sum-numbers[L],numbers,target);
        }
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        DFS(1,numbers[0],numbers,target);
        DFS(1,-numbers[0],numbers,target);
        answer=cnt;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = {1,1,1,1,1};
        int target=3;
        System.out.println(solution(numbers,target));
    }
}

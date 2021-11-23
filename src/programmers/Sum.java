package programmers;

import java.util.Arrays;

public class Sum {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int tmp=Arrays.stream(arr).sum();
        for(int x : numbers) {
            tmp-=x;
        }
        answer=tmp;
        return answer;
    }

    public static void main(String[] args) {
        Sum T = new Sum();
        int[] priorities={1,2,3,4,6,7,8,0};
        System.out.println(T.solution(priorities));
    }
}

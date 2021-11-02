package programmers;

import java.util.Arrays;

public class greedy4 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lt = 0;
        for (int rt=people.length-1; lt<=rt; rt--){
            if (people[lt]+people[rt]<=limit) lt++;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {;
        int[] people={30,40,60,70};
        int limit=100;
        System.out.println(solution(people,limit));
    }
}

package programmers;

import java.util.Arrays;

class LifeBoat {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lt = 0;
        for (int rt=people.length-1; lt<=rt; rt--){
            if (lt==rt) {
                answer++;
                break;
            }
            if (people[lt]+people[rt]<=limit) lt++;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80, 50}, 100));
    }
}
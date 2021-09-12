package AlgorithmPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int prioriry;
    public Person(int id,int prioriry) {
        this.id=id;
        this.prioriry=prioriry;
    }
}

class fiveEight {

    public int solution(int n, int m, int[] array) {
        int answer=0;
        Queue<Person> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            queue.offer(new Person(i, array[i]));
        }
        while (!queue.isEmpty()) {
            Person tmp=queue.poll();
            for (Person x : queue) {
                if (x.prioriry> tmp.prioriry) {
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp!=null) {
                answer++;
                if (tmp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        fiveEight T = new fiveEight();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m= scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, m, array));
    }
}

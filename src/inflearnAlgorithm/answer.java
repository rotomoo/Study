package inflearnAlgorithm;

import java.util.Scanner;

class answer {
    public String solution(String[] arr) {
        String answer="";
        return answer;
    }

    public static void main(String[] args) {
        answer T = new answer();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.next();
        }
        System.out.println(T.solution(arr));
    }
}
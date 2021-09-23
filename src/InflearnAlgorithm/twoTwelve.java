package InflearnAlgorithm;

import java.util.Scanner;

public class twoTwelve {

    public int solution(int n,int m, int[][] numArr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (numArr[k][s] == i) pi = s;
                        if (numArr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoTwelve T = new twoTwelve();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int [][] numArr = new int[m][n];
        for (int i =0;i<m;i++) {
            for (int j=0;j<n;j++) {
                numArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n,m,numArr));
    }
}
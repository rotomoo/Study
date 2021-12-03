package InflearnAlgorithm;

import java.util.Scanner;

public class twoTen {
    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};

    public int solution(int num, int[][] numArr) {
        int answer=0;
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                boolean flag=true;
                for (int k=0; k<4; k++) {
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if (nx>=0 && nx<num && ny>=0 && ny<num && numArr[nx][ny]>=numArr[i][j]) {
                        flag=false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        twoTen T = new twoTen();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] numArr = new int[num][num];
        for (int i =0;i<num;i++) {
            for (int j=0;j<num;j++) {
                numArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(num, numArr));
    }
}

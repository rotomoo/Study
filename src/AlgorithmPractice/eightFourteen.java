package AlgorithmPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point4 {
    int x,y;

    Point4(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class eightFourteen {
    static int[] dx ={-1,-1,0,1,1,1,0,-1};
    static int[] dy ={0,1,1,1,0,-1,-1,-1};
    static int[][] arr;
    static int answer=0, n;
    Queue<Point4> queue=new LinkedList<>();

    public void BFS(int x, int y) {
        queue.offer(new Point4(x, y));
        while (!queue.isEmpty()) {
            Point4 tmp = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    queue.offer(new Point4(nx, ny));
                }
            }
        }
    }

    public void solution(int[][] arr) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                if (arr[i][j]==1) {
                    answer++;
                    arr[i][j]=0;
                    BFS(i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        eightFourteen T = new eightFourteen();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }
}

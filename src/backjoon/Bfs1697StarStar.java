package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bfs1697StarStar {
    static int n, k;
    static int[] ch;

    public static void BFS() {
        if (n==k) {
            System.out.print(0);
            return;
        }
        Queue<Integer> q = new LinkedList<>();
        ch[n]=1;
        q.offer(n);
        int cnt=0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i=0; i<len;i++){
                int tmp = q.poll();
                int[] dx = {-1, 1, tmp};
                for (int j = 0; j < 3; j++) {
                    int nx = tmp + dx[j];
                    if (nx == k) {
                        System.out.print(cnt+1);
                        return;
                    }
                    if (nx >= 0 && nx <= 100000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            cnt++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        ch = new int[100001];
        BFS();
    }
}

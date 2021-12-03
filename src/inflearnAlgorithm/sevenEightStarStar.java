package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class sevenEightStarStar {
    static int answer=0;
    int[] dis={-1,1,5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch= new int[10001];
        ch[s]=1;
        int L=0;
        q.offer(s);
        while (!q.isEmpty()) {
            int len=q.size();
            for (int i=0; i<len; i++) {
                int x = q.poll();
                for (int j=0; j<dis.length; j++) {
                    int nx = x+dis[j];
                    if (nx==e) return L+1;
                    if (nx>=1 && nx<=10000 && ch[nx]==0) {
                        ch[nx]=1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        sevenEightStarStar T = new sevenEightStarStar();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
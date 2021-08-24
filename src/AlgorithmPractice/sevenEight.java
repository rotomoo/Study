package AlgorithmPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class sevenEight {
    int answer=0;
    int[] dis={1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int s, int e) {
        ch=new int[10001];
        ch[s]=1;
        queue.offer(s);
        int L=0;
        while (!queue.isEmpty()) {
            int len=queue.size();
            for (int i=0; i<len; i++) {
                int x =queue.poll();
                for (int j=0; j<3; j++) {
                    int nx=x+dis[j];
                    if (nx==e) return L+1;
                    if (nx>=1 && nx<=10000 && ch[nx]==0) {
                        ch[nx]=1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        sevenEight T = new sevenEight();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(T.BFS(s, e));
    }
}

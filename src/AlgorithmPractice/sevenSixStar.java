package AlgorithmPractice;

import java.util.Scanner;

class sevenSixStar {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if (L==n+1) {
            String tmp="";
            for (int i=1; i<=n; i++) {
                if (ch[i] == 1) tmp+=(i+" ");
            }
            if (tmp.length()>0) System.out.println(tmp);
        }
        else {
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        sevenSixStar T = new sevenSixStar();
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        ch =new int[n+1];
        T.DFS(1);
    }
}
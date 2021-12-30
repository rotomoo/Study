package numberOfCases;

import java.util.Scanner;

public class Subset {
    static int[] ch;
    static int n;

    public static void DFS(int L) {
        if (L == n+1) {
            String tmp="";
            for (int i=1; i<=n; i++) {
                if (ch[i]==1) tmp+=i+" ";
            }
            if (tmp.length()>0) System.out.println(tmp);
        }
        else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n+1];
        DFS(1);
    }
}
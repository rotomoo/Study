package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brute14888Switch {
    static int n,max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
    static int[] arr,operator;
    public static void DFS(int L, int sum) {
        if (L==n) {
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        else {
            for (int i=0; i<4; i++) {
                if (operator[i]==0) continue;
                operator[i]--;
                switch (i) {
                    case 0: DFS(L+1,sum+arr[L]); break;
                    case 1: DFS(L+1,sum-arr[L]); break;
                    case 2: DFS(L+1,sum*arr[L]); break;
                    case 3: DFS(L+1,sum/arr[L]); break;
                }
                operator[i]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n= Integer.parseInt(br.readLine());
        arr = new int[n];
        operator = new int[4];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st= new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            operator[i]=Integer.parseInt(st.nextToken());
        }
        DFS(1,arr[0]);
        System.out.println(max);
        System.out.println(min);
    }
}

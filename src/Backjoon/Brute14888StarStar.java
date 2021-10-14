package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brute14888StarStar {
    static int[] arr,arr2;
    static int n,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

    public static void DFS(int L, int sum) {
        if (L==n-1) {
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        else {
            for (int i=0; i<4; i++) {
                if (arr2[i]>0) {
                    arr2[i]--;
                    if (i==0) DFS(L+1,sum+arr[L+1]);
                    else if (i==1) DFS(L+1,sum-arr[L+1]);
                    else if (i==2) DFS(L+1,sum*arr[L+1]);
                    else DFS(L+1,sum/arr[L+1]);
                    arr2[i]++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        arr2 = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        DFS(0,arr[0]);
        System.out.println(max);
        System.out.println(min);
    }
}

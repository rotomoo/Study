package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Brute2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(arr, Collections.reverseOrder());
        int answer=0;
        for (int i=0; i<n; i++) {
            int sum=arr[i];
            if (sum>m) continue;
            for (int j=i+1; j<n; j++) {
                sum=arr[i]+arr[j];
                if (sum>m) continue;
                for (int k=j+1; k<n; k++) {
                    sum=arr[i]+arr[j]+arr[k];
                    if (sum>m) continue;
                    if (sum==m) {
                        System.out.print(sum);
                        return;
                    }
                    if (answer<=m) answer=Math.max(answer,sum);
                }
            }
        }
        System.out.print(answer);
    }
}

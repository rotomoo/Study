package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i]=Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int answer=arr[0]*n;
        for (int i=1; i<n; i++) {
            int tmp=arr[i]*(n-i);
            if (tmp>answer) answer=tmp;
        }
        System.out.print(answer);
    }
}

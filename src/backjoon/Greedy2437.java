package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy2437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int tmp=0;
        for (int i=0; i<n; i++) {
            if (arr[i]>tmp+1){
                System.out.println(tmp+1);
                return;
            }
            tmp+=arr[i];
        }
        System.out.print(tmp+1);
    }
}

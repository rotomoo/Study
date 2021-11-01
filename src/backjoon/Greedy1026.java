package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr1[i]= Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr2[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        int tmp=Integer.MAX_VALUE, answer=0;
        for (int i=0; i<n; i++) {
            int cnt=0;
            int max=0;
            for (int j=0; j<n; j++) {
                if (arr2[j]==max) {
                    cnt++;
                    continue;
                }
                if (arr2[j]<tmp && arr2[j]>max) {
                    max = Math.max(max, arr2[j]);
                    cnt=1;
                }
            }
            tmp=max;
            if (cnt==1) answer+=arr1[i]*tmp;
            else {
                while (cnt!=0) {
                    answer += arr1[i] * tmp;
                    i++;
                    cnt--;
                }
                i--;
            }
        }
        System.out.print(answer);
    }
}
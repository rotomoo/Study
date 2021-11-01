package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch1920Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st=new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st=new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) arr2[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        for (int i=0; i<m; i++) {
            int lt=0;
            int rt=arr.length-1;
            int mid=0;
            if (arr2[i]<arr[lt] || arr2[i]>arr[rt]) {
                bw.write(0+"\n");
                continue;
            }
            while (lt<=rt) {
                mid=(lt+rt)/2;
                if (arr[mid]==arr2[i]) {
                    bw.write(1+"\n");
                    break;
                }
                else if (arr2[i]<arr[mid]) rt=mid-1;
                else lt=mid+1;
            }
            if (arr[mid]!=arr2[i]) bw.write(0+"\n");
        }
        bw.flush();
        bw.close();
    }
}

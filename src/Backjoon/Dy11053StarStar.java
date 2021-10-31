package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dy11053StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[] dy= new int[n];
        dy[0]=1;
        int answer=1;
        for (int i=1; i<n; i++) {
            dy[i]=1;
            for (int j=0; j<i; j++) {
                if (arr[i]>arr[j]) {
                    dy[i]=Math.max(dy[i],dy[j]+1);
                }
            }
            answer=Math.max(answer,dy[i]);
        }
        System.out.print(answer);
    }
}

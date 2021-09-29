package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy11399Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int[] p= new int[n];
        st=new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            p[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);
        int answer=0, tmp=0;
        for (int i=0; i<n; i++) {
            tmp+=p[i];
            answer+=tmp;
        }
        System.out.print(answer);
    }
}

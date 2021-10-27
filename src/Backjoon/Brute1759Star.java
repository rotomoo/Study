package Backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Brute1759Star {
    static int l,c;
    static char[] arr;
    static char[] answer;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean check(char x) {
        if (x=='a' || x=='e' || x=='i' || x=='o' || x=='u') return true;
        else return false;
    }

    public static void DFS(int L,int s, int a, int b) throws IOException {
        if (L==l) {
            if (a>=1 && b>=2) {
                for (char x : answer) bw.write(x+"");
                bw.newLine();
            }
        }
        else {
            for (int i=s; i<c; i++) {
                answer[L]=arr[i];
                if (check(arr[i])) {
                    DFS(L+1,i+1,a+1,b);
                }
                else DFS(L+1,i+1,a,b+1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        l=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        arr= new char[c];
        answer= new char[l];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<c; i++) {
            arr[i]=st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
        DFS(0,0,0,0);
        bw.flush();
        bw.close();
    }
}

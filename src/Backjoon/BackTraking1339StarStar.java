package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BackTraking1339StarStar {
    static int n, answer;
    static ArrayList<Character> list;
    static int[] ch, tmp;
    static String[] str;
    public static void DFS(int L) {
        if (L==list.size()) {
            int sum =0;
            for (int i=0; i<n; i++) {
                int num=0;
                for (int j=0; j<str[i].length();j++) {
                    num*=10;
                    num+=tmp[list.indexOf(str[i].charAt(j))];
                }
                sum+=num;
            }
            answer=Math.max(answer,sum);
        }

        else {
            for (int i=0; i<=9; i++) {
                if (ch[i]==0) {
                    ch[i]=1;
                    tmp[L]=i;
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        ch=new int[10];
        str= new String[n];
        for (int i=0; i<n; i++) {
            str[i] = br.readLine();
            for (int j=0; j<str[i].length(); j++) {
                if (!list.contains(str[i].charAt(j))) list.add(str[i].charAt(j));
            }
        }
        tmp=new int[list.size()];
        DFS(0);
        System.out.println(answer);
    }
}

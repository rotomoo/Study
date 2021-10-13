package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy1439Greed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int one=0, zero=0;
        if (arr[0]=='1') one++;
        else zero++;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]!=arr[i-1]) {
                if (arr[i]=='0') zero++;
                else one++;
            }
        }
        System.out.print(Math.min(zero,one));
    }
}

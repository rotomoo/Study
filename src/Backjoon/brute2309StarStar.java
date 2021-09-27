package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class brute2309StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[9];
        ArrayList<Integer> answer = new ArrayList<>();
        int sum=0;
        for (int i=0; i<9; i++) {
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
            answer.add(arr[i]);
        }
        for (int i=0; i<9; i++) {
            for (int j=i+1; j<9; j++) {
                if (sum-arr[i]-arr[j]==100) {
                    answer.remove(arr[i]);
                    answer.remove(arr[j]);
                    Collections.sort(answer);
                    for (int x : answer) System.out.println(x);
                    return;
                }
            }
        }
    }
}

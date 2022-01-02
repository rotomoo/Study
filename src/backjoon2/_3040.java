package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

        int[] arr = new int[9];
        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = Arrays.stream(arr).sum();
        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if (i != j && sum-arr[i]-arr[j] == 100) {
                    for (int k=0; k<9; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(arr[k]);
                    }
                }
            }
        }
    }

//    static int[] arr, ch;
//
//    public static void DFS(int L,int start, int sum) {
//        if (L == 7 && sum == 100){
//            for (int i=0; i<9; i++) {
//                if (ch[i]==1) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//        else {
//            for (int i=start; i<9; i++) {
//                if (ch[i]==0) {
//                    ch[i] = 1;
//                    DFS(L + 1, i + 1, sum + arr[i]);
//                    ch[i] = 0;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
//        arr = new int[9];
//        ch = new int[9];
//        for (int i=0; i<9; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        DFS(0,0, 0);
//    }
}

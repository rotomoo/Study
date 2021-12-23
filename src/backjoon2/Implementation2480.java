package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implementation2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tmp = 0;
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            tmp = Math.max(arr[i], tmp);
        }
        Arrays.sort(arr);
        int cnt = 1;
        for (int i=0; i<2; i++) {
            if (arr[i] == arr[i+1]) {
                cnt++;
                tmp = arr[i];
            }
        }
        if (cnt == 3) System.out.println(10000 + 1000*tmp);
        else if (cnt == 2) System.out.println(1000 + 100*tmp);
        else System.out.println(tmp*100);
    }
}

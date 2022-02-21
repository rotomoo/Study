package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int lt = 1;
        int rt = arr[n - 1];
        int answer = 0;
        Arrays.sort(arr);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int startPosition = arr[0];
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] - startPosition >= mid) {
                    startPosition = arr[i];
                    cnt ++;
                }
            }
            if (cnt >= m) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        System.out.println(answer);
    }
}

package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy1026 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // == List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
        ArrayList<Integer> bList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            bList.add(b[i]);
        }

        Arrays.sort(a);

        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            int max = Collections.max(bList);
            answer += (a[i] * max);
            bList.remove(Integer.valueOf(max));
        }

        System.out.println(answer);
    }
}
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // buffer 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * 입력 받기
         */
        int n = Integer.parseInt(br.readLine());

        // a, b 배열 선언
        int[] a = new int[n];
        int[] b = new int[n];

        // 다음줄 받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 입력
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 다음줄 받기
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        /**
         * 구현
         */

        // b 배열 리스트화 (stream api 사용할경우 List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());)
        ArrayList<Integer> bList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            bList.add(b[i]);
        }

        // a배열 정렬
        Arrays.sort(a);

        int answer = 0;
        
        // a의 최소값부터
        for (int i = 0; i < a.length; i++) {
            // bList max 구하기
            int max = Collections.max(bList);
            
            // a의 최소값 * b의 최대값 더해주기
            answer += a[i] * max;
            
            // bList max 원소 삭제 (==bList.remove(new Integer(max));
            bList.remove(Integer.valueOf(max));
        }

        System.out.println(answer);
    }
}

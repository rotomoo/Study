package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tmp=1000-Integer.parseInt(br.readLine());
        int[] arr = {500,100,50,10,5,1};
        int answer=0;
        for (int i=0; i<=arr.length; i++) {
            if (arr[i]<=tmp) {
                answer+=tmp/arr[i];
                tmp%=arr[i];
                if (tmp==0) break;
            }
        }
        System.out.print(answer);
    }
}

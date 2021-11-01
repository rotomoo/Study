package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer=0;
        char tmp = str.charAt(0);
        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i)!=tmp) {
                tmp=str.charAt(i);
                for (int j=i; j<str.length(); j++) {
                    if (str.charAt(j)!=tmp) {
                        tmp=str.charAt(j);
                        i=j;
                        break;
                    }
                }
                answer++;
            }
        }
        System.out.print(answer);
    }
}

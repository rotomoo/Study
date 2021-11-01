package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brute1436StarStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int tmp=666, tmp2=1;
        while (n!=tmp2) {
            tmp++;
            if (String.valueOf(tmp).contains("666")) tmp2++;
        }
        System.out.print(tmp);
    }
}
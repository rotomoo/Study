package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();
        for (String x : arr) {
            s = s.replace(x, "a");
        }
        System.out.println(s.length());
    }
}

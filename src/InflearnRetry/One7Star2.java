package InflearnRetry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One7Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        String str2 = new StringBuilder(str).reverse().toString();
        if (!str.equals(str2)) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}

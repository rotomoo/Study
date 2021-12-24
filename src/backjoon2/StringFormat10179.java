package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFormat10179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            double x = Double.parseDouble(br.readLine())*0.8;
            System.out.println("$"+String.format("%.2f", x));
        }
    }
}

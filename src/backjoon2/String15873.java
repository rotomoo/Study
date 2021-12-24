package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int index = 1;
        if (a.length()==3 && a.charAt(0) == '1') index=2;
        else if (a.length()==4) index=2;
        String x = a.substring(0,index);
        String y = a.substring(index);
        System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
    }
}
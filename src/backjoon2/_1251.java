package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _1251 {

    public static String make_s(String[] st) {
        String tmp = "";
        for (int i=0; i<3; i++) {
            tmp += new StringBuilder(st[i]).reverse().toString();
        }
        return tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] st = new String[3];
        ArrayList<String> answer = new ArrayList<>();
        for (int i=1; i<s.length()-1; i++) {
            for (int j=i+1; j<s.length(); j++) {
                st[0] = s.substring(0,i);
                st[1] = s.substring(i,j);
                st[2] = s.substring(j);
                answer.add(make_s(st));
            }
        }
        Collections.sort(answer);
        System.out.println(answer.get(0));
    }
}

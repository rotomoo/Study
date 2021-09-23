package InflearnRetry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one5Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] answer = new char[str.length()];
        int lt=0, rt=str.length()-1;
        while(lt<rt) {
            if (Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))) {
                answer[lt]=str.charAt(rt);
                answer[rt]=str.charAt(lt);
                lt++;
                rt--;
            }
            else if (!Character.isAlphabetic(str.charAt(lt))) {
                answer[lt]=str.charAt(lt);
                lt++;
            }
            else {
                answer[rt]=str.charAt(rt);
                rt--;
            }
        }
        for (char x : answer) System.out.print(x);
    }
}
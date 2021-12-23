package backjoon2;

import java.io.*;

public class indexOfInt2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int rt = String.valueOf(b).length()-1;
        while (rt >=0) {
//            bw.write(a * Integer.parseInt(String.valueOf(String.valueOf(b).charAt(rt--)))+"\n");
            bw.write(a * (String.valueOf(b).charAt(rt--)-'0')+"\n");
        }
        bw.write(a*b+"");
        bw.flush();
        bw.close();
    }
}

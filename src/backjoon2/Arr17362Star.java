package backjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arr17362Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] answer = {2,1,2,3,4,5,4,3};
        System.out.println(answer[a%8]);
//        if (a % 8 == 1) System.out.println(1);
//        else if (a % 8 == 2) System.out.println(2);
//        else if (a % 8 == 3) System.out.println(3);
//        else if (a % 8 == 4) System.out.println(4);
//        else if (a % 8 == 5) System.out.println(5);
//        else if (a % 8 == 6) System.out.println(4);
//        else if (a % 8 == 7) System.out.println(3);
//        else System.out.println(2);
    }
}

package backjoon2;

import java.io.*;

public class Implementation10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = n / 300;
        int b = (n % 300) / 60;
        int c = ((n % 300) % 60) / 10;
        System.out.print(n%10==0 ? a + " " + b + " " + c : -1);
    }

//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            int t = Integer.parseInt(br.readLine());
//            int[] arr = {300,60,10};
//            int[] arr2 = new int[3];
//            if (t%10!=0) {
//                System.out.print(-1);
//                return;
//            }
//            for (int i=0; i<3;i++) {
//                if (arr[i]<=t) {
//                    arr2[i]=t/arr[i];
//                    t%=arr[i];
//                    if (t==0) break;
//                }
//            }
//            for (int x : arr2) bw.write(x+" ");
//            bw.flush();
//            bw.close();
//        }

//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int c = Integer.parseInt(br.readLine());
//            int b = c/60;
//            int a = b/5;
//            c %=60;
//            System.out.println(c%10==0 ? a+" "+b%5+" "+c/10:-1);
//        }
}
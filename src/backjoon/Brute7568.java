package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point3 {
    int x, y;
    Point3(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class Brute7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Point3> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Point3(a, b));
        }
        for (int i=0; i<n; i++) {
            int answer=1;
            for (int j=0; j<n; j++) {
                if (list.get(i).x<list.get(j).x && list.get(i).y<list.get(j).y) answer++;
            }
            bw.write(answer+" ");
        }
        bw.flush();
        bw.close();
    }
}

package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class DSolution1 {
    static char[][] graph;
    static int answer=0;
    static class Point{
        int x, y;
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    public void BFS(int i, String[] drum) {
//        for (int l=0; l<drum.length; l++) {
//            System.out.println();
//            for (int k=0; k<drum[0].length(); k++) {
//                System.out.print(graph[l][k]);
//            }
//        }
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,i));
        int cnt=0;
        while (!q.isEmpty()) {
            Point tmp= q.poll();
            int nx = tmp.x;
            int ny = tmp.y;
            if (nx==drum.length){
                answer++;
                return;
            }
            if (nx>=0 && nx<drum.length && ny>=0 && ny<drum[0].length()) {
                if (cnt==2) {
                    return;
                }
                if (graph[nx][ny]=='*'){
                    cnt++;
                    if (cnt==2) {
                        return;
                    }
                    q.offer(new Point(nx+1,ny));
                }
                else if (graph[nx][ny]=='#'){
                    q.offer(new Point(nx+1,ny));
                }
                else if (graph[nx][ny]=='>'){
                    q.offer(new Point(nx,ny+1));
                }
                else if (graph[nx][ny]=='<'){
                    q.offer(new Point(nx,ny-1));
                }
            }
        }
    }

    public int solution(String[] drum) {
        answer = 0;
        graph=new char[drum.length][drum[0].length()];
        for (int l=0; l<drum.length; l++) {
            String str = drum[l];
            for (int k=0; k<drum[0].length(); k++) {
                graph[l][k]=str.charAt(k);
            }
        }
        for (int i=0; i<drum.length; i++) {
            BFS(i, drum);
        }
        return answer;
    }

    public static void main(String[] args) {
        DSolution1 T = new DSolution1();
        String[] drum={"#*****","#*****","#*****","#*****","******","******"};
        System.out.println(T.solution(drum));
    }
}

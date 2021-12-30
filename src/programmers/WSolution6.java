package programmers;

import java.util.ArrayList;

public class WSolution6 {
    static class Point {
        String str;
        int st, et;
        Point(String str, int st, int et) {
            this.str=str;
            this.st=st;
            this.et=et;
        }
    }
    public String solution(double time, String[][] plans) {
        String answer = "";
        ArrayList<Point> list = new ArrayList<>();
        double[][] arr = {{13,18},{9.5,18}};
        for (int i=0; i<plans.length; i++) {
            for (int j=1; j<=2; j++) {
                int tmp=0;
                for (char x : plans[i][j].toCharArray()) {
                    if (x>=48 && x<=57) tmp=tmp*10+(x-48);
                }
                if (plans[i][j].endsWith("PM")) tmp+=12;
                plans[i][j]= String.valueOf(tmp);
            }
            list.add(new Point(plans[i][0],Integer.parseInt(plans[i][1]),Integer.parseInt(plans[i][2])));
        }
        for (Point x : list) System.out.println(x.str+""+x.st+""+x.et);
        double need=0;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).st<arr[1][1]) need+=arr[1][1]-list.get(i).st;
            if (list.get(i).et>arr[0][0]) need+=list.get(i).et-arr[0][0];
            if (need>time) {
                answer=list.get(i-1).str;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        WSolution6 T = new WSolution6();
        double time=3.5;
        String[][] plans={{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};
        System.out.println(T.solution(time, plans));
    }
}
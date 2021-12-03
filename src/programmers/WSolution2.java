package programmers;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class WSolution2 {
    public String solution2(String[] log) {
        String answer = "";
        int tmp=0;
        ArrayList<String[]> list = new ArrayList<>();
        for (int i=0; i<log.length; i++) {
            list.add(log[i].split(":"));
        }
        ArrayList<Integer> time = new ArrayList<>();
        for (String[] x : list) {
            time.add(Integer.parseInt(x[0])*60+Integer.parseInt(x[1]));
        }
        //for (int x : time) System.out.println(x);
        for (int i=1; i<list.size(); i+=2) {
            if (time.get(i)-time.get(i-1)>=105) {
                tmp+=105;
            }
            else if (time.get(i)-time.get(i-1)>=5) {
                tmp+=time.get(i)-time.get(i-1);
            }
        }
        answer=LocalTime.MIN.plus(Duration.ofMinutes(tmp)).toString();
        return answer;
    }

    public static void main(String[] args) {
        WSolution2 T = new WSolution2();
        String[] log={"08:30", "09:00"};
        System.out.println(T.solution2(log));
    }
}
package programmers2;

// you can also use imports, for example:
// import java.util.*;

import java.util.ArrayList;
import java.util.List;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class tttSolution {

    private List<Integer> getTime(String[] sArr) {
        String dayOfWeek;
        String time;
        List<Integer> timeList = new ArrayList<>();
        Integer curTime = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (i%2==0) dayOfWeek = sArr[i];
            else time = sArr[i];
        }

//        switch (dayOfWeek) {
//            case "Mon":
//                time = 0;
//
//
//                sdf.format("E mm:ss");
//        }

//        timeList.add()
        return timeList;
    }

    public int solution(String S) {
        // write your code in Java SE 11
        String[] sArr = S.split(" ");

        getTime(sArr);
        return 0;
    }
}
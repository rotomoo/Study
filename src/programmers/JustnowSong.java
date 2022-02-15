package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class JustnowSong {
    static class Point {
        int idx;
        String song;
        int min;

        public Point(int idx, String song, int min) {
            this.idx = idx;
            this.song = song;
            this.min = min;
        }
    }


    public static int calcMin(String str1, String str2) {
        String[] tmp1 = str1.split(":");
        String[] tmp2 = str2.split(":");
        int min1 = Integer.parseInt(tmp1[0]) * 60 + Integer.parseInt(tmp1[1]);
        int min2 = Integer.parseInt(tmp2[0]) * 60 + Integer.parseInt(tmp2[1]);
        return min2 - min1;
    }

    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String[] arr = {"A#", "C#", "D#", "F#", "G#"};
        String[] arr2 = {"H", "I", "J", "K", "L"};

        for (int i = 0; i < 5; i++) {
            m = m.replace(arr[i], arr2[i]);
        }

        ArrayList<Point> answerList = new ArrayList<>();
        for (String x : musicinfos) {
            String[] split = x.split(",");
            int min = calcMin(split[0], split[1]);
            String rhythm = split[3];
            for (int i = 0; i < 5; i++) {
                rhythm = rhythm.replace(arr[i], arr2[i]);
            }
            int len = rhythm.length();
            String result = "";
            int minTmp = min;
            if (minTmp >= len) {
                while (minTmp >= len) {
                    result += rhythm.substring(0, len);
                    minTmp -= len;
                }
            }
            else {
                result = rhythm.substring(0, minTmp);
                minTmp = 0;
            }
            if (minTmp != 0) result += rhythm.substring(0, minTmp);
            int idx = 0;
            if (result.contains(m)) {
                answerList.add(new Point(idx++, split[2], min));
            }
            System.out.println(result);
        }
        Collections.sort(answerList, (o1, o2) -> {
            if (o1.min == o2.min) return o1.idx - o2.idx;
            else return o2.min - o1.min;
        });
        if (!answerList.isEmpty()) return answerList.get(0).song;
        return answer;
    }
}
package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class nickname {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String[]> list = new ArrayList<>();
        for (int i=0; i< record.length; i++) {
            list.add(record[i].split(" "));
        }
        int cnt=0;
        for (String[] x : list) {
            if (!x[0].equals("Leave")) {
                map.put(x[1], x[2]);
            }
            if (x[0].equals("Change")) {
                cnt++;
            }
        }
        String[] result = new String[record.length-cnt];
        int index=0;
        for (String[] x : list) {
            if (x[0].equals("Enter")) {
                result[index++]=map.get(x[1])+"님이 들어왔습니다.";
            }
            else if (x[0].equals("Leave")) {
                result[index++]=map.get(x[1])+"님이 나갔습니다.";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        nickname T = new nickname();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(T.solution(record));
    }
}

package leetcode;


import java.util.ArrayList;
import java.util.Collections;

public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {

        ArrayList<String> letter = new ArrayList();

        ArrayList<String> digit = new ArrayList();

        for(String log : logs){
            String[] strs = log.split("\\s+");
            if(Character.isDigit(strs[1].charAt(0))){
                digit.add(log);
            } else{
                letter.add(log);
            }
        }

        Collections.sort(letter, (a, b)-> {
            if (a.substring(a.indexOf(' ')).equals(b.substring(b.indexOf(' ')))) return a.compareTo(b);
            else return a.substring(a.indexOf(' ')).compareTo(b.substring(b.indexOf(' ')));
        });

        int idx = 0;
        String[] ans = new String[logs.length];

        for(String s : letter){
            ans[idx++] = s;
        }


        for(String s : digit){
            ans[idx++] = s;
        }
        return ans;

    }
}


//class Solution {
//    public String[] reorderLogFiles(String[] logs) {
//
//        List<String> letter = new ArrayList();
//
//        List<String> digit = new ArrayList();
//
//        for(String log : logs){
//            String[] strs = log.split(" ");
//            if(Character.isDigit(strs[1].charAt(0))){
//                digit.add(log);
//            } else{
//                letter.add(log);
//            }
//        }
//
//        Collections.sort(letter, (a,b)-> a.substring(a.indexOf(' ')).equals(b.substring(b.indexOf(' '))) ?
//                a.compareTo(b) : a.substring(a.indexOf(' ')).compareTo(b.substring(b.indexOf(' '))));
//
//
//        int idx = 0;
//        String[] ans = new String[logs.length];
//
//        for(String s : letter){
//            ans[idx++] = s;
//        }
//
//
//        for(String s : digit){
//            ans[idx++] = s;
//        }
//        return ans;
//
//    }
//}
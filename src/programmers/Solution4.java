package programmers;

import java.util.Arrays;

public class Solution4 {
    public int[] solution(String s) {
        String str="";
        s=s+" ";
        int cnt=1;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                cnt++;
            } else {
                str+=s.charAt(i);
                if (cnt==1) str+=String.valueOf(1);
                else if (cnt>1) {
                    str+=String.valueOf(cnt);
                    cnt=1;
                }
            }
        }
        boolean flag=false;
        int tmp=0;
        if (str.length()>2 && str.charAt(0)==str.charAt(str.length()-2)) {
            tmp=str.charAt(1)+str.charAt(str.length()-1)-'0';
            flag=true;
        }
        String strtmp="";
        if (flag) {
            for (int i = 2; i < str.length() - 1; i++) {
                if (Character.isDigit(str.charAt(i))) {
                    strtmp += str.charAt(i);
                }
            }
            strtmp+=(char)tmp;
        }
        else {
            for (char x : str.toCharArray()) {
                if(Character.isDigit(x)) {
                    strtmp += x;
                }
            }
        }
        int[] answer = new int[strtmp.length()];
        for (int i=0; i<strtmp.length(); i++) {
            answer[i]=strtmp.charAt(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution4 T = new Solution4();
        String s="abc";
        System.out.println(T.solution(s));
    }
}

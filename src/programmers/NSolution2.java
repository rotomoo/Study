package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class NSolution2 {

    public boolean isCheck(String curBirth) {
        // 초기 셋팅
        curBirth = curBirth.replaceAll("[^-0-9]", "");
        String YYYY = curBirth.substring(0, 4);
        String firstSubtract = curBirth.substring(4, 5);
        String MM = curBirth.substring(5, 7);
        String secondSubtract = curBirth.substring(7, 8);
        String DD = curBirth.substring(8, 10);

        // 조건1
        if (curBirth.length() != 10) return false;
        boolean isNumericY = YYYY.chars().allMatch(Character::isDigit);
        boolean isNumericM = MM.chars().allMatch(Character::isDigit);
        boolean isNumericD = DD.chars().allMatch(Character::isDigit);
        if (!isNumericY || !isNumericM || !isNumericD) return false;
        if (!firstSubtract.equals("-") || !secondSubtract.equals("-")) return false;

        // 조건2
        int iYYYY = Integer.parseInt(YYYY);
        if (!(iYYYY >= 1900) || !(iYYYY <= 2021)) return false;

        // 조건3
        int iMM = Integer.parseInt(MM);
        if (!(iMM >= 1) || !(iMM <= 12)) return false;

        // 조건4
        int iDD = Integer.parseInt(DD);

        // 윤년 체크
        boolean flag = false;
        if (iYYYY % 400 == 0 || (iYYYY % 4 == 0 && iYYYY % 100 != 0)) flag = true;

        if (iMM == 1 || iMM == 3 || iMM == 5 || iMM == 7 || iMM == 8 || iMM == 10 || iMM == 12) {
            if (!(iDD >= 1) || !(iDD <= 31)) return false;
        } else if (iMM == 4 || iMM == 6 || iMM == 9 || iMM == 11) {
            if (!(iDD >= 1) || !(iDD <= 30)) return false;
        } else if (iMM == 2 && flag) {
            if (!(iDD >= 1) || !(iDD <= 29)) return false;
        } else if (iMM == 2 && !flag) {
            if (!(iDD >= 1) || !(iDD <= 28)) return false;
        }

        return true;
    }

    public int solution(String[] birth) {
        int answer = 0;
        for (String curBirth : birth) {
            // 10글자 아니라면 continue
            if (curBirth.length() != 10) continue;
            // Check
            if (isCheck(curBirth)) answer++;
        }
        return answer;
    }
}
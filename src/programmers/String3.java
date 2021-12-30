package programmers;

public class String3 {
    public int solution(java.lang.String s) {
        java.lang.String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<10; i++) {
            s = s.replace(arr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}

package programmers;

class String {
    public int solution(java.lang.String s) {
        java.lang.String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<10; i++) {
            s = s.replace(arr[i], java.lang.String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(java.lang.String[] args) {
        String T = new String();
    }
}

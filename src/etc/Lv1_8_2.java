package etc;

class Lv1_8_2 {
    static int answer = 0;

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) answer++;
        }
        return answer;
    }
}
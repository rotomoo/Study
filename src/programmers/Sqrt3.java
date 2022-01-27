package programmers;

class Sqrt3 {
    public long solution(long n) {
        long answer = -1;
        double sqrt = Math.sqrt(n);
        if (sqrt == Double.parseDouble(String.valueOf((int)Math.sqrt(n)))) return (long) Math.pow(sqrt, 2);
        return answer;
    }
}
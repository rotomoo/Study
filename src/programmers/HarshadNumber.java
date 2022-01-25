package programmers;

class HarshadNumber {

    public int calc(int num) {
        int sum = 0;
        while (num!=0) {
            sum += num%10;
            num/=10;
        }
        return sum;
    }

    public boolean solution(int x) {
        return x % calc(x)==0;
    }
}
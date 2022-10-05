package programmers2;

class DevSolution3 {

    public long solution(int k) {
        long[] dy = new long[k + 1];
        long[] tmp = {0, 0, 1, 1, 1, 2, 3, 1};
        for (int i = 0; i <= k; i++) {
            dy[i] = tmp[i];
        }

        for (int i = 4; i <= k; i++) {
            for(int j=2; j<=7; j++) {
                if (i-j >= 0) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    dy[i] += dy[i-j];
                    System.out.println("dy[i] = " + dy[i]);
                }
            }
        }
        System.out.println();

        return dy[k];
    }

    public static void main(String[] args) {
        DevSolution3 T = new DevSolution3();
        System.out.println(T.solution(5));
    }
}
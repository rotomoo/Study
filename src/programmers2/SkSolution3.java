package programmers2;

import java.math.BigInteger;

class SkSolution3 {
    public static int solution(int width, int height, int[][] diagonals) {
        int[][] dy = new int[height+1][width+1];
        for (int i = 0; i <= width; i++) {
            dy[0][i] = 1;
        }
        for (int i = 0; i <= height; i++) {
            dy[i][0] = 1;
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                dy[i][j] = dy[i-1][j] + dy[i][j-1];
                dy[i][j] %= 10000019;
            }
        }

        BigInteger answer = new BigInteger("0");

        for (int[] x : diagonals) {
            int sx = x[0]-1;
//            System.out.println("sx = " + sx);
            int sy = x[1];
//            System.out.println("sy = " + sy);
            int ex = x[0];
//            System.out.println("ex = " + ex);
            int ey = x[1]-1;
//            System.out.println("ey = " + ey);
//            System.out.println(dy[sx][sy]+ " "+ dy[height-ex][width-ey]);
//            System.out.println(dy[ex][ey]+ " "+ dy[height-sx][width-sy]);
//            System.out.println();
//            answer += dy[sx][sy] * dy[width - ex][height - ey] % 10000019;
//            answer += dy[ex][ey] * dy[width - sx][height - sy] % 10000019;
//            answer %= 10000019;
            BigInteger a = new BigInteger(String.valueOf(dy[sx][sy]));
            BigInteger b = new BigInteger(String.valueOf(dy[width - ex][height - ey]));
            BigInteger c = new BigInteger("10000019");
            BigInteger result1 = a.multiply(b).mod(c);
            BigInteger e = new BigInteger(String.valueOf(dy[ex][ey]));
            BigInteger f = new BigInteger(String.valueOf(dy[width - sx][height - sy]));
            BigInteger result2 = e.multiply(f).mod(c);
            answer = answer.add(result1).add(result2).mod(c);
        }
        return answer.intValue();
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 2, new int[][]{{1,1},{2,2}}));
        System.out.println(solution(51, 37, new int[][]{{17,19}}));
    }
}
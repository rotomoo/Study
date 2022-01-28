package programmers;

import java.util.ArrayList;

class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int r, c;
    static int[][][] ch;

    public static int light(String[] grid, int x, int y , int k) {
        int cnt = 0;
        while (true) {
            if (ch[x][y][k]==1) break;
            ch[x][y][k]=1;
            if(grid[x].charAt(y) == 'L') k = (k+1) % 4;
            else if(grid[x].charAt(y) == 'R') k = (k+3) % 4;
            x = (x+dx[k]+r)%r;
            y = (y+dy[k]+c)%c;
            System.out.println(x+" "+y);
            cnt++;
        }
        return cnt;
    }

    public int[] solution(String[] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        r = grid.length;
        c = grid[0].length();
        ch = new int[r][c][4];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < 4; k++) {
                    if (ch[i][j][k] == 0) {
                        list.add(light(grid, i, j, k));
                    }
                }
            }
        }
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
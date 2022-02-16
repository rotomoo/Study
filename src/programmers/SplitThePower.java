package programmers;
class SplitThePower {
    static int[] unf;
    static int answer = Integer.MAX_VALUE;

    public static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa]=fb;
    }

    public static void calcMin(int n) {
        int tmp = unf[1];
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (unf[i]!=tmp) cnt++;
        }
        int cnt2 = n - cnt;
        int result = Math.abs(cnt2-cnt);
        answer = Math.min(answer, result);
    }

    public int solution(int n, int[][] wires) {

        unf = new int[n + 1];
        int idx = 0;
        while (idx < n - 1) {
            for (int i = 1; i <= n; i++) unf[i] = i;
            for (int i = 0; i < wires.length; i++) {
                if (idx == i) continue;
                union(wires[i][0], wires[i][1]);
            }
            for (int i = 1; i <= n; i++) {
                find(i);
            }
            calcMin(n);
            idx++;
        }
        return answer;
    }
}
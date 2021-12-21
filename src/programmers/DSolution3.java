package programmers;

public class DSolution3 {
    public int solution(String s) {
        char[][] keyboard={{'q','w','e','r','t','y','u','i','o'},
                {'p','a','s','d','f','g','h','j','k'},
                {'l','z','x','c','v','b','n','m'}};
        int answer = 0;

        for (int i=1; i<s.length(); i++) {
            answer+=isCheck(s.charAt(i-1),s.charAt(i),keyboard);
        }
        return answer % 1000000007;
    }

    public int isCheck(char tmp, char tmp2, char[][] keyboard) {
        int ax=0;
        int ay=0;
        int bx=0;
        int by=0;
        for (int i=0; i<keyboard.length; i++) {
            for (int j=0; j<keyboard[i].length; j++) {
                if (keyboard[i][j]==tmp) {
                    ax=i;
                    ay=j;
                }
                if (keyboard[i][j]==tmp2) {
                    bx=i;
                    by=j;
                }
            }
        }
        return Math.abs(ax-bx)+Math.abs(ay-by);
    }

    public static void main(String[] args) {
        DSolution3 T = new DSolution3();
        String s="abcc";
        System.out.println(T.solution(s));
    }
}

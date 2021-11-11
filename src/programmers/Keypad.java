package programmers;

public class Keypad {
    static class Point {
        int x,y;
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Point L = new Point(3,0);
        Point R = new Point(3,2);
        for (int n : numbers) {
            if (n==1 || n==4 || n==7) {
                answer += "L";
                if (n==1) L=new Point(0,0);
                else if (n==4) L=new Point(1,0);
                else L=new Point(2,0);
            }
            else if (n==3 || n==6 || n==9) {
                answer += "R";
                if (n==3) R=new Point(0,0);
                else if (n==6) R=new Point(1,0);
                else R=new Point(2,0);
            }
            else {
                if (n==2) {
                    if (Math.abs(L.x-0)+Math.abs(L.y-1)>Math.abs(R.x-0)+Math.abs(R.y-1)) {
                        answer+="R";
                        R=new Point(0,1);
                    }
                    else if (Math.abs(L.x-0)+Math.abs(L.y-1)==Math.abs(R.x-0)+Math.abs(R.y-1)) {
                        if (hand.equals("right")) {
                            answer+="R";
                            R=new Point(0,1);
                        }
                        else {
                            answer+="L";
                            L=new Point(0,1);
                        }
                    }
                    else {
                        answer+="L";
                        L=new Point(0,1);
                    }
                }
                else if (n==5) {
                    if (Math.abs(L.x-1)+Math.abs(L.y-1)>(Math.abs(R.x-1)+Math.abs(R.y-1))) {
                        answer+="R";
                        R=new Point(1,1);
                    }
                    else if (Math.abs(L.x-1)+Math.abs(L.y-1)==(Math.abs(R.x-1)+Math.abs(R.y-1))) {
                        if (hand.equals("right")) {
                            answer+="R";
                            R=new Point(1,1);
                        }
                        else {
                            answer+="L";
                            L=new Point(1,1);
                        }
                    }
                    else {
                        answer+="L";
                        L=new Point(1,1);
                    }
                }
                else if (n==8) {
                    if (Math.abs(L.x-2)+Math.abs(L.y-1)>Math.abs(R.x-2)+Math.abs(R.y-1)) {
                        answer+="R";
                        R=new Point(2,1);
                    }
                    else if (Math.abs(L.x-2)+Math.abs(L.y-1)==Math.abs(R.x-2)+Math.abs(R.y-1)) {
                        if (hand.equals("right")) {
                            answer+="R";
                            R=new Point(2,1);
                        }
                        else {
                            answer+="L";
                            L=new Point(2,1);
                        }
                    }
                    else {
                        answer+="L";
                        L=new Point(2,1);
                    }
                }
                else {
                    if (Math.abs(L.x-3)+Math.abs(L.y-1)>Math.abs(R.x-3)+Math.abs(R.y-1)) {
                        answer+="R";
                        R=new Point(3,1);
                    }
                    else if (Math.abs(L.x-3)+Math.abs(L.y-1)==Math.abs(R.x-3)+Math.abs(R.y-1)) {
                        if (hand.equals("right")) {
                            answer+="R";
                            R=new Point(3,1);
                        }
                        else {
                            answer+="L";
                            L=new Point(3,1);
                        }
                    }
                    else {
                        answer+="L";
                        L=new Point(3,1);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Keypad T = new Keypad();
        int[] numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";
        System.out.println(T.solution(numbers,hand));
    }
}

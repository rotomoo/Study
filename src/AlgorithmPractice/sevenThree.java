package AlgorithmPractice;

class sevenThree {

    public int DFS(int n) {
        if (n==1) return 1;
        else {
            return n*DFS(n-1);
        }
    }

    public static void main(String[] args) {
        sevenThree T = new sevenThree();
        System.out.print(T.DFS(5));
    }
}

package AlgorithmPractice;

class sevenOne {

    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        sevenOne T = new sevenOne();
        T.DFS(3);
    }
}

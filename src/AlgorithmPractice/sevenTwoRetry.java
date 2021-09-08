package AlgorithmPractice;

public class sevenTwoRetry {
    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        sevenTwoRetry T = new sevenTwoRetry();
        T.DFS(11);
    }
}
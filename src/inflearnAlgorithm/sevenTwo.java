package InflearnAlgorithm;

class sevenTwo {

    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n / 2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        sevenTwo T = new sevenTwo();
        T.DFS(11);
    }
}

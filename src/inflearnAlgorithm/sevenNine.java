package InflearnAlgorithm;

class Node3 {
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}

public class sevenNine {
    Node3 root;
    public int DFS(int L, Node3 root) {
        if (root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        sevenNine Tree = new sevenNine();
        Tree.root=new Node3(1);
        Tree.root.lt=new Node3(2);
        Tree.root.rt=new Node3(3);
        Tree.root.lt.lt=new Node3(4);
        Tree.root.lt.rt=new Node3(5);
        System.out.println(Tree.DFS(0, Tree.root));
    }
}

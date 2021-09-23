package InflearnAlgorithm;

class Node5{
    int data;
    Node5 lt, rt;
    public Node5(int val) {
        data=val;
        lt=rt=null;
    }
}

public class sevenFiveStar {
    Node5 root;
    public void DFS(Node5 root) {
        if (root==null) return;
        else {
            System.out.print(root.data+" ");
            DFS(root.lt);
            //System.out.print(root.data+" ");
            DFS(root.rt);
            //System.out.print(root.data+" ");

        }
    }

    public static void main(String[] args) {
        sevenFiveStar Tree = new sevenFiveStar();
        Tree.root=new Node5(1);
        Tree.root.lt=new Node5(2);
        Tree.root.rt=new Node5(3);
        Tree.root.lt.lt=new Node5(4);
        Tree.root.lt.rt=new Node5(5);
        Tree.root.rt.lt=new Node5(6);
        Tree.root.rt.rt=new Node5(7);
        Tree.DFS(Tree.root);
    }
}
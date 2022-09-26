package InflearnAlgorithm;

class Node1 {
    int data;
    Node1 lt, rt;
    public Node1(int val) {
        data=val;
        lt=rt=null;
    }
}
public class sevenFive {
    Node1 root;
    public void DFS(Node1 root){
        if (root==null) return;
        else {
            //System.out.print(root.data+" ");// 전위순회
            DFS(root.lt);
            System.out.print(root.data+" "); //중위순회
            DFS(root.rt);
            //System.out.print(root.data+" "); //후위순회
        }
    }

    public static void main(String[] args) {
        sevenFive Tree = new sevenFive();
        Tree.root=new Node1(1);
        Tree.root.lt=new Node1(2);
        Tree.root.rt=new Node1(3);
        Tree.root.lt.lt=new Node1(4);
        Tree.root.lt.rt=new Node1(5);
        Tree.root.rt.lt=new Node1(6);
        Tree.root.rt.rt=new Node1(7);
        Tree.DFS(Tree.root);
    }
}

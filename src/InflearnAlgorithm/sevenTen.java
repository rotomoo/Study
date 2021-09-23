package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 lt, rt;
    public Node4(int val) {
        data = val;
        lt = rt = null;
    }
}

public class sevenTen {
    Node4 root;
    public int BFS(Node4 root) {
        Queue<Node4> queue = new LinkedList<>();
        queue.offer(root);
        int L=0;
        while (!queue.isEmpty()) {
            int len=queue.size();
            for (int i=0; i<len; i++) {
                Node4 cur=queue.poll();
                if (cur.lt==null && cur.rt==null) return L;
                if (cur.lt!=null) queue.offer(cur.lt);
                if (cur.rt!=null) queue.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        sevenTen Tree = new sevenTen();
        Tree.root=new Node4(1);
        Tree.root.lt=new Node4(2);
        Tree.root.rt=new Node4(3);
        Tree.root.lt.lt=new Node4(4);
        Tree.root.lt.rt=new Node4(5);
        System.out.print(Tree.BFS(Tree.root));
    }
}

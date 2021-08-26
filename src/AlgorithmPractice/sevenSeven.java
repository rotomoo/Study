package AlgorithmPractice;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 lt, rt;
    public Node2(int val) {
        data=val;
        lt=rt=null;
    }
}

public class sevenSeven {
    Node2 root;
    public void BFS(Node2 root) {
        Queue<Node2> queue = new LinkedList<>();
        queue.offer(root);
        int L=0;
        while (!queue.isEmpty()) {
            int len=queue.size();
            System.out.print(L+" : ");
            for (int i=0; i<len; i++) {
                Node2 cur=queue.poll();
                System.out.print(cur.data+" ");
                if (cur.lt!=null) queue.offer(cur.lt);
                if (cur.rt!=null) queue.offer(cur.rt);
            }
            L++;
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        sevenSeven Tree = new sevenSeven();
        Tree.root=new Node2(1);
        Tree.root.lt=new Node2(2);
        Tree.root.rt=new Node2(3);
        Tree.root.lt.lt=new Node2(4);
        Tree.root.lt.rt=new Node2(5);
        Tree.root.rt.lt=new Node2(6);
        Tree.root.rt.rt=new Node2(7);
        Tree.BFS(Tree.root);
    }
}

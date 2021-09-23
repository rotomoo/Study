package InflearnAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

class Node6 {
    int data;
    Node6 lt, rt;
    Node6(int val) {
        data=val;
        lt=rt=null;
    }
}

class sevenSevenStar {
    Node6 root;

    public void BFS(Node6 root) {
        Queue<Node6> q= new LinkedList<>();
        q.offer(root);
        int L=0;
        while (!q.isEmpty()) {
            int len=q.size();
            System.out.print(L+" : ");
            for (int i=0; i<len; i++) {
                Node6 cur=q.poll();
                System.out.print(cur.data+" ");
                if (cur.lt!=null) q.offer(cur.lt);
                if (cur.rt!=null) q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sevenSevenStar T = new sevenSevenStar();
        T.root=new Node6(1);
        T.root.lt=new Node6(2);
        T.root.rt=new Node6(3);
        T.root.lt.lt=new Node6(4);
        T.root.lt.rt=new Node6(5);
        T.root.rt.lt=new Node6(6);
        T.root.rt.rt=new Node6(7);
        T.BFS(T.root);
    }
}
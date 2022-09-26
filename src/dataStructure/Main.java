package dataStructure;


import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(10);
//        Queue<Integer> queue = new LinkedList<>(10);
//        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        pq.offer(2);
//        pq.offer(5);
//        pq.offer(1);
//        System.out.println("pq = " + pq);
//        System.out.println("pq.poll() = " + pq.poll());
//        System.out.println("pq.poll() = " + pq.poll());
//        System.out.println("pq.poll() = " + pq.poll());

        deque.offer(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.peekLast() = " + deque.peekLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
    }
}

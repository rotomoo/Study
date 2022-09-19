package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {

    private int [] arr;
    private int front, rear;
    private int size;

    public QueueImplementation(int size) {
        arr = new int[size];
        front = rear = -1;
        this.size = size;
    }

    public void offer(int num) {
        if (isFull()) {
            System.out.println("overFlow");
            System.exit(-1);
        }
        arr[++rear] = num;
    }

    public int poll() {
        if (empty()) {
            System.out.println("queue is Empty");
            System.exit(-1);
        }
        return arr[++front];
    }

    public int peek() {
        if (empty()) {
            System.out.println("queue is Empty");
            System.exit(-1);
        }
        return arr[front+1];
    }

    public int size() {
        return rear - front;
    }

    public boolean empty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void print() {
        System.out.print("[");
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(10);
        queue.print(); // []
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.print(); // [1, 2, 3, ]
        System.out.println("queue.size() = " + queue.size()); // queue.size() = 3
        System.out.println("queue.poll() = " + queue.poll()); // queue.poll() = 1
        queue.print(); // [2, 3, ]
        System.out.println("queue.peek() = " + queue.peek()); // queue.peek() = 2
        System.out.println("queue.size() = " + queue.size()); // queue.size() = 2
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.print(); // [2, 3, 1, 2, 3, ]
        System.out.println("queue.size() = " + queue.size()); // queue.size() = 5
    }
}

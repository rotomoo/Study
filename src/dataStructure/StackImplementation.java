package dataStructure;

public class StackImplementation {

    private int[] arr;
    private int top;
    private int size;

    public StackImplementation(int size) {
        arr = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("overFlow");
            System.exit(-1);
        }
        arr[++top] = num;
    }

    public int pop() {
        if (empty()) {
            System.out.println("stack is Empty");
            System.exit(-1);
        }
        int pollValue = arr[top--];
        return pollValue;
    }

    public int peek() {
        if (empty()) {
            System.out.println("stack is Empty");
            System.exit(-1);
        }
        return arr[top];
    }

    public int search(int num) {
        for (int i = size() - 1; i >= 0; i--) {
            if (arr[i] == num) {
                return size() - i;
            }
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == size;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size(); i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation(4);
        stackImplementation.print(); // stack = []
        stackImplementation.push(1);
        stackImplementation.push(1);
        stackImplementation.push(2);
        stackImplementation.push(3);
        stackImplementation.print(); // stack = [1, 1, 2, 3]
        System.out.println("stack.pop() = " + stackImplementation.pop()); // stack.pop() = 3
        System.out.println("stack.peek() = " + stackImplementation.peek()); // stack.peek() = 2
        System.out.println("stack.empty() = " + stackImplementation.empty()); // stack.empty() = false
        stackImplementation.print(); // stack = [1, 1, 2]
        System.out.println("stack.search(1) = " + stackImplementation.search(1)); // stack.search(1) = 2
        System.out.println("stack.search(2) = " + stackImplementation.search(2)); // stack.search(2) = 1
        StackImplementation stackImplementation2 = new StackImplementation(0);
        System.out.println("stackImplementation2.size() = " + stackImplementation.size()); // 3
        System.out.println("stackImplementation2 = " + stackImplementation2.size()); // 0
        System.out.println("stackImplementation2.empty() = " + stackImplementation2.empty()); // true
        System.out.println("stackImplementation2.isFull() = " + stackImplementation2.isFull()); // true
//        System.out.println("stackImplementation2.peek() = " + stackImplementation2.peek()); // empty
        stackImplementation2.push(1); // overflow
    }
}
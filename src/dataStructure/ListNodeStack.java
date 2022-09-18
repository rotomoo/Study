package dataStructure;

class ListNodeStack {

    private ListNode head;

    public ListNodeStack() {
        this.head = null;
    }

    void push(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    int pop() {
        if (head == null) {
            throw new RuntimeException("out of index");
        }
        ListNode before = null;
        ListNode node = head;
        while (node.next != null) {
            before = node;
            node = node.next;
        }
        int data = node.data;
        if (before == null) {
            head = null;
        } else {
            before.next = null;
        }
        return data;
    }

    public static void main(String[] args) {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(1);
        System.out.println("listNodeStack.pop() = " + listNodeStack.pop());
    }
}

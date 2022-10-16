package dataStructure;

class ListNode<T> {
    T value;
    ListNode<T> nextListNode;
}

public class ListNodeStack<T> {

    // 필드, topNode는 Stack의 최상단 노드
    private ListNode<T> topNode;

    // Stack 생성자, 생성될 때 topNode null
    public ListNodeStack() {
        topNode = null;
    }

    // 비었는지 확인하는 메서드, topNode가 null이라면 true반환
    public boolean isEmpty() {
        return topNode == null;
    }

    // 스택에 값을 넣는 메서드
    public void push(T value) {
        // ListNode 생성자로, newListNode 인스턴스 생성
        ListNode<T> newListNode = new ListNode();
        
        // newListNode의 값은 입력받은 값.
        newListNode.value = value;

        // newListNode의 다음 노드는 필드(기존)의 topNode가 되고
        newListNode.nextListNode = topNode;

        // 필드(현재)의 topNode를 지금 만든 newListNode로 바꿈.
        topNode = newListNode;
    }

    // 스택의 최상단 값을 삭제하고 리턴하는 메서드
    public T pop() {
        // 비어있는지 확인하고
        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        // 비어있지 않다면 topNode의 값을 가져와 popValue선언
        T popValue = topNode.value;
        
        // 기존 topNode는 topNode의 nextNode로 바꿔주고
        topNode = topNode.nextListNode;

        // popValue를 리턴해줌.
        return popValue;
    }

    // 스택의 최상단 값 리턴하는 메서드
    public T peek() {
        // 비어있는지 확인
        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        // 비어있지 않다면 최상단 노드의 값을 리턴
        return topNode.value;
    }

    public static void main(String[] args) {
        ListNodeStack<String> stack = new ListNodeStack<>();
        System.out.println("stack.peek() = " + stack.peek()); // stack is empty, stack.peek() = null
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println("stack.peek() = " + stack.peek()); // stack.peek() = D

        while (!stack.isEmpty()) {
            System.out.println("stack.pop() = " + stack.pop()); // stack.pop() = D, C, B, A
        }
    }
}
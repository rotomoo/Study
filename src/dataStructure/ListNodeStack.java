package dataStructure;

class ListNodeStack<T> {

    // 현재 값, 다음 노드를 가지고있는 Node객체
    private class Node {
        T value;
        Node nextNode;
    }

    // topNode는 Stack의 최상단 노드
    private Node topNode;

    // Stack 생성자, 생성될 때 topNode null
    public ListNodeStack() {
        topNode = null;
    }

    // 비었는지 확인하는 메서드, topNode가 null이라면 true반환
    private boolean isEmpty() {
        return topNode == null;
    }

    // 스택에 값을 넣는 메서드
    public void push(T value) {
        // 기존에 만들었던 node객체인, newNode 선언
        Node newNode = new Node();
        
        // newNode의 값은 입력받은 값.
        newNode.value = value;

        // newNode의 다음 노드는 기존의 topNode가 되고
        newNode.nextNode = topNode;

        // topNode를 지금 만든 newNode로 바꿈.
        topNode = newNode;
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
        topNode = topNode.nextNode;

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
package reflection;

public class VectorStackCompositionTest {

    public static void main(String[] args) {
        VectorStackComposition stack = new VectorStackComposition();

        stack.push(1);
        System.out.println("stack.pop() = " + stack.pop());
    }
}

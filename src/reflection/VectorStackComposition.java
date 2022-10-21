package reflection;

import java.util.Vector;

public class VectorStackComposition<T> {
    private final Vector<T> vector = new Vector<>();

    public void push(T t) {
        vector.add(t);
    }

    public T pop() {
        if (vector.size()==0) {
            throw new IllegalStateException();
        }
        return vector.remove(vector.size()-1);
    }
}

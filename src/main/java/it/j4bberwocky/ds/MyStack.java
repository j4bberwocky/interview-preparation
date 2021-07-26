package it.j4bberwocky.ds;

/** A Last-in-first-out (LIFO) Data Structure */
public class MyStack<T> {

    private static class StackNode<T> {
        private T value;
        private StackNode<T> next;
        public StackNode(T value) {
            this.value = value;
        }
    }
    

    private StackNode<T> top; 

    public T pop() {
        if (top == null) {
            return null;
        }
        T value = top.value;
        top = top.next;
        return value;
    }

    public void push(T item) {
        StackNode<T> node = new StackNode<>(item);
        node.next = top;
        top = node;
    }

    public T peek() {
        if (top == null) {
            return null;
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

}

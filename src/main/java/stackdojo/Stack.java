package stackdojo;

public class Stack<T> {

    private int top;
    private int size;
    private T[] stack;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public void push(T element) {

        if (stack == null) {
            stack = (T[]) new Object[this.size];
        }

        if (!isFull()) {
            stack[++top] = element;
        } else {
            throw new StackOverflowError();
        }
    }

    public T peek() throws StackUnderflow {

        if (!isEmpty()) {
            return stack[top];
        } else {
            throw new StackUnderflow();
        }
    }

    public T pop() throws StackUnderflow {

        if (!isEmpty()) {
            return stack[top--];
        } else {
            throw new StackUnderflow();
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int countFreeSpace() {
        return size - top - 1;
    }
}

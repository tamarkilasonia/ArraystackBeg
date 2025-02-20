public class ArrayStack <T> implements Stack<T>{
    private T[] stack;      // Array to hold stack elements
    private int top;        // Index of the top element
    private int capacity;   // Maximum capacity of the stack

    // Constructor to initialize the stack
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1; // Stack is initially empty
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = item; // Increment top and add item
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack[top];  // Get the top element
        stack[top--] = null; // Clear the reference and decrement top
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top]; // Return the top element without removing it
    }

    @Override
    public boolean isEmpty() {

        return top == -1; // Stack is empty if top is -1
    }

    @Override
    public int size() {

        return top + 1; // Number of elements is top + 1
    }
}

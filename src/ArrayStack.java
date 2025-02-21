public class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;
    
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            resize(2 * capacity); // Double the capacity
        }
        stack[++top] = item;
    }
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack[top];
        stack[top--] = null;
        // Shrink size if needed
        if (top > 0 && top == capacity / 4) {
            resize(capacity / 2);
        }
        return item;
    }
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    // Resize method to dynamically adjust the capacity
    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newStack = (T[]) new Object[newCapacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
    }

    // Clear method to empty the stack
    public void clear() {
        for (int i = 0; i <= top; i++) {
            stack[i] = null;
        }
        top = -1;
    }

    // Contains method to check if an item is in the stack
    public boolean contains(T item) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    // toString method to display the stack elements
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}



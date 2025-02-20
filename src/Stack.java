public interface Stack <T> {
    void push(T item);       // Adds an item to the top of the stack
    T pop();                 // Removes and returns the item at the top of the stack
    T peek();                // Returns the item at the top without removing it
    boolean isEmpty();       // Checks if the stack is empty
    int size();              // Returns the number of items in the stack
}

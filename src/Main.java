
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(5); // Stack with capacity 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size()); // Output: 3
        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Stack size after pop: " + stack.size()); // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Stack size: " + stack.size()); // Output: 5

        
       
    }
}

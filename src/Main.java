public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(2); // Small initial capacity to test resizing
        stack.push(10);
        stack.push(20);
        stack.push(30); // Should trigger resize

        System.out.println("Stack: " + stack); // Output: [10, 20, 30]
        System.out.println("Stack size: " + stack.size()); // Output: 3
        System.out.println("Contains 20? " + ((ArrayStack<Integer>) stack).contains(20)); // Output: true
        System.out.println("Contains 40? " + ((ArrayStack<Integer>) stack).contains(40)); // Output: false

        stack.pop();
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        stack.clear();
        System.out.println("Stack after clear: " + stack); // Output: []
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}


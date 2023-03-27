package mmdc;

public class Stack {
    public void run() {
        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}

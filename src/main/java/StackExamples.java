import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExamples {

  public static void main(String[] args) {

    System.out.println("Using Deque:");
    Deque<String> stack = new ArrayDeque<>();
    stack.push("First request");
    stack.push("Second request");
    stack.push("Third request");
    System.out.println(stack);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack);
    stack.poll();
    System.out.println(stack);

    // Using Stack instead of Deque
    System.out.println("Using Stack instead of Deque:");
    Stack<String> stack1 = new Stack<>();
    stack1.push("First request");
    stack1.push("Second request");
    stack1.push("Third request");
    System.out.println(stack1);
    System.out.println(stack1.peek());

  }

}

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>();
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue);

    // Priority Queue implementation:
    System.out.println("Priority Queue implementation:");
    Queue<String> queue1 = new PriorityQueue<>();
    queue1.offer("Person One");
    queue1.offer("Person Two");
    queue1.offer("Person Three");
    queue1.offer("Person Four");
    System.out.println(queue1);
    System.out.println(queue1.peek());
    queue1.poll();
    System.out.println(queue1);
  }

}

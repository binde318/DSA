import java.util.LinkedList;
import java.util.Queue;

public class QueueSDA {
    public static void main(String[] args) {
        //FIFO= first in first out.
        //methods offer(),poll() and peek().

        Queue<String> queue = new LinkedList<>();
        queue.offer("James");
        queue.offer("Jack");
        queue.offer("Joseph");
        queue.offer("Thomas");
        queue.poll();
        System.out.println(queue.contains("Jack"));
        System.out.println(queue.size());
        String str=queue.peek();
        System.out.println(str);
        System.out.println(queue);
    }
}

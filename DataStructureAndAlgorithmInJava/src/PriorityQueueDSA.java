import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDSA {
    public static void main(String[] args) {
        //Priority queue is a FIFO with the priority on each element to be executed first
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(4.0);
        queue.offer(2.0);
        queue.offer(3.1);
        queue.offer(1.0);
        queue.offer(5.0);
        queue.offer(6.0);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

package bt3;

public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Adding elements to the queue
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        // Display the queue
        System.out.print("Queue: ");
        queue.display();

        // Removing elements from the queue
        System.out.println("Dequeued: " + queue.deQueue());
        System.out.println("Dequeued: " + queue.deQueue());

        // Display the queue after dequeuing
        System.out.print("Queue after dequeue: ");
        queue.display();

        // Adding more elements
        queue.enQueue(50);
        queue.enQueue(60);

        // Display the final state of the queue
        System.out.print("Final Queue: ");
        queue.display();
    }
}

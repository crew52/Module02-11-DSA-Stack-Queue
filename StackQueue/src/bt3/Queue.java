package bt3;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            rear.setLink(front);
        } else {
            rear.setLink(newNode);
            rear = newNode;
            rear.setLink(front);
        }
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value;
        if (front == rear) {
            value = front.getData();
            front = rear = null;
        } else {
            value = front.getData();
            front = front.getLink();
            rear.setLink(front);
        }
        return value;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getLink();
        } while (temp != front);
        System.out.println();
    }
}

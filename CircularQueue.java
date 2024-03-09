public class CircularQueue {

    private final int[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity = 5;

    public CircularQueue() {
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
        } else {
            System.out.println("Queue is full. Unable to enqueue " + data);
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            int data = queue[front];
            front = (front + 1) % capacity;
            size--;
        } else {
            System.out.println("Queue is empty. Unable to dequeue.");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Elements in the queue:");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size != 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}